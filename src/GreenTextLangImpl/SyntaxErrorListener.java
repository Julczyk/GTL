package GreenTextLangImpl;//package ../GreenTextLangParser.java;
import Exceptions.SyntaxException;
import GreenTextLangBase.GreenTextLangLexer;
import GreenTextLangBase.GreenTextLangParser;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.atn.Transition;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.*;

import java.nio.file.Path;
import java.util.*;

public class SyntaxErrorListener extends BaseErrorListener {
    private final List<String> sourceLines;
    private final String pathFile;

    public SyntaxErrorListener(Path path, String sourceLines) {
        this.sourceLines = Arrays.stream(sourceLines.split("\\r?\\n")).toList();
        this.pathFile = String.format("%s", path.toAbsolutePath());
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        if (recognizer instanceof GreenTextLangParser) {
            CommonToken token = (CommonToken) offendingSymbol;
            GreenTextLangParser parser = (GreenTextLangParser) recognizer;
            ParserRuleContext ctx = parser.getRuleContext();
            String rulename = parser.getRuleNames()[ctx.getRuleIndex()];

            String message = tryToResolveError(parser, token, rulename, e);

            String codeLine = sourceLines.get(line - 1) + "\n" +
                    " ".repeat(charPositionInLine) +
                    "^".repeat(token.getText().length());

            //System.out.println(rulename + " " + token.getText() + " " + ctx.start.getText());
            throw new SyntaxException(pathFile, codeLine, message==null ? msg : message, line, charPositionInLine);
        } else {

            GreenTextLangLexer lexer = (GreenTextLangLexer) recognizer; // Cast recognizer to lexer, because it's lexer's stage

            CodePointCharStream charStream = (CodePointCharStream) lexer.getInputStream(); // Retrieve input stream at the time of an error

            String errorChar = new String(Character.toChars(charStream.LA(1))); //Return char that caused the error
            // Using Character class to handle extended Unicode character (e.g. emojis)

            throw new SyntaxException("Unrecognized character: " + errorChar, lexer.getLine(), lexer.getCharPositionInLine());
        }
        // throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }

    private String ExpectedTokens(Parser parser, NoViableAltException e) {
        IntervalSet tokenSet = new IntervalSet();
        for (var dead_end : e.getDeadEndConfigs().getStates())
        {
            var state_number = dead_end.stateNumber;
            var state = parser.getATN().states.get(state_number);
            for (Transition t : state.getTransitions())
            {
                switch (t.getSerializationType())
                {
                    case Transition.RULE: break;
                    case Transition.PREDICATE: break;
                    case Transition.WILDCARD: break;
                    default:
                        if (!t.isEpsilon())
                        {
                            IntervalSet x = t.label();
                            tokenSet.addAll(x);
                        }
                        break;
                }
            }
        }
        return tokenSet.toString(parser.getVocabulary());
    }

    public String tryToResolveError(GreenTextLangParser parser, CommonToken faultyToken, String rulename, RecognitionException e) {
        ParserRuleContext ctx = parser.getRuleContext();
        String tokenTypeName = getLexerName(faultyToken);
        //  added missing token exception

        if (e instanceof NoViableAltException noViable) {
            String text = faultyToken.getText();
            String expectedTokens = ExpectedTokens(parser, noViable);


            if(text.equals("\r\n")){
                return "Missing token \n" +
                        "Expecting one of: " + expectedTokens;
            }
            if(!Arrays.asList(possibleTokens).contains(faultyToken.getText()) && ctx.children != null) {
                return findClosestToken(parser, faultyToken, noViable);
            }
            if(rulename.equals("code_blocks")) {
                if (findNotClosedStatement(parser, faultyToken, noViable) != null){
                    return findNotClosedStatement(parser, faultyToken, noViable);
                }

//                return "If expression not closed, expecting one of: {'or sth', 'or', 'or not'}" + "\n"
//                        + ctx.getText() + "\n"
//                        + ctx.getParent().getText() + "\n"
//                        + expectedTokens + "\n"
//                        + rulename + "\n"
//                        + ((NoViableAltException) e).getDeadEndConfigs().getStates() + "\n"
//                        + faultyToken.getTokenIndex() + "\n"
//                        + findNotClosedStatement(parser, faultyToken);
            }
            if(expectedTokens.equals("\'\'th\'") && getPreviousToken(parser, faultyToken).getText().chars().allMatch(Character::isDigit)) {
                return "Cannot assign to literal!";
            }

            return findClosestToken(parser, faultyToken, noViable);
        }

        //System.out.println("token name" + tokenTypeName + " " + tokens);
        if(tokenTypeName != null ) {
            switch (tokenTypeName) {
                case "DECIMAL_LITERAL":
                    return "Decimal literal cannot be here";
                case "NEWLINE":
                    return "Expected something before newline";
                case "NAME":
                    return "Name cannot be here";
            }
        }
        //System.out.println(rulename + " faulty: " + faultyToken.getText() + " token type" + tokenTypeName +  ctx.getParent());


        if(rulename.equals("expression") && ctx.getParent() instanceof GreenTextLangParser.Loop_declarationContext) {
            return "While loop expression cannot be empty";
        }

        if(rulename.equals("code_blocks") && ctx.getParent() instanceof GreenTextLangParser.If_declarationContext) {
            return "Function should be closed";
        }

        if(rulename.equals("code_blocks") && ctx.start.getText().equals("be") && faultyToken.getText().equals("<EOF>")) {
            return "Function not closed";
        }

        if(rulename.equals("statement_newline") && ctx.getParent() instanceof GreenTextLangParser.If_declarationContext){
            return "If statement cannot be unclosed";
        }

        if(e.getCause() instanceof InputMismatchException inputMismatchException) {
            return inputMismatchException.getMessage();
        }

        return "Unrecognized character: " + faultyToken.getText();
    }

    private String getLexerName(CommonToken token) {
        return GreenTextLangParser.VOCABULARY.getSymbolicName(token.getType());
    }

    private Token getNextToken(Parser recognizer) {
        TokenStream tokens = recognizer.getInputStream();
        if (tokens == null) return null;

        int index = tokens.index();
        if (index > 0) {
            Token prevToken = tokens.get(index+38);
            return (prevToken != null && prevToken.getType() != Token.EOF) ? prevToken : null;
        }
        return null;
    }

    private Token getPreviousToken(Parser recognizer, CommonToken faultyToken) {
        TokenStream tokens = recognizer.getInputStream();
        if (tokens == null) return null;
        int index = faultyToken.getTokenIndex();

        if (index > 2) {
            Token prevToken = tokens.get(index-2);
            return (prevToken != null && prevToken.getType() != Token.EOF) ? prevToken : null;
        }
        return null;
    }

    private String findNotClosedStatement(Parser recognizer, CommonToken faultyToken, NoViableAltException noViable) {
        TokenStream tokens = recognizer.getInputStream();
        if (tokens == null) return null;
        int index = faultyToken.getTokenIndex();//recognizer.getInputStream().getText().length() - 1;//
        int[] closing = {0,0,0,0}; // if, fun, loop, ors from if
        while (index > 0){
            if (tokens.get(index).getText().equals("implying")) {
                closing[3] = 0;
                closing[0]++;
            }else if (tokens.get(index).getText().equals("or sth")) {
//                if(closing[3] != 0){
//                    return "or was not expected. Declare start of if statement before by using \'implying\'";
//                }
                closing[3] = 0;
                closing[0]--;
            }else if (tokens.get(index).getText().equals("be")) {
                closing[1]++;
            }else if (tokens.get(index).getText().equals("profit")) {
                closing[1]--;
            }else if (tokens.get(index).getText().equals("think that")) {
                closing[2]++;
            }else if (tokens.get(index).getText().equals("reconsider")) {
                closing[2]--;
            }else if (tokens.get(index).getText().equals("or")) {
                closing[3]++;
            }

            index--;
        }

        if(closing[3] > 0 && closing[0] == 0) {
            return "or was not expected. Declare start of if statement before by using \'implying\'";
        }

        if(closing[0] > 0) {
            return "If statement was never closed, use \'or sth\' to close if";
        }
        if(closing[0] < 0) {
            return "If statement closed, yet was never opened. Use \'implying\' to start if";
        }

        if(closing[1] > 0) {
            return "Function statement was never closed, use \'profit\' to close function";
        }
        if(closing[1] < 0) {
            return "Function statement closed, yet was never opened. Use \'be\' to start new function";
        }

        if(closing[2] > 0) {
            return "Loop statement was never closed, use \'reconsider\' to close loop";
        }
        if(closing[2] < 0) {
            return "Loop statement closed, but not opened use \'think that\' to start loop structure";
        }
        String expected = ExpectedTokens(recognizer, noViable);

        return null;
    }

    private String[] getAllTokens(){
        int maxTokenType = GreenTextLangParser.VOCABULARY.getMaxTokenType();
        Vocabulary vocab = GreenTextLangParser.VOCABULARY;
        String[] output = new String[maxTokenType + 1];
        Arrays.fill(output, "");
        for (int i = 3; i <= maxTokenType; i++) {
            String name = vocab.getDisplayName(i);
            if (name != null) {
                //System.out.println("Token Type: " + i + " → " + name);
                output[i] = name;
            }
        }
        return output;
    }

    private String findClosestToken(Parser parser, CommonToken faultyToken, NoViableAltException noViable) {
        String text = faultyToken.getText();
        String expectedTokens = ExpectedTokens(parser, noViable);
        String bestToken = "No token found";
        int similarity = Integer.MAX_VALUE;
        for (var token : possibleTokens) {
            if(compute_Levenshtein_distance(text, token) < similarity) {
                similarity = compute_Levenshtein_distance(text, token);
                bestToken = token;
            }
        }

        String bestToken2 = "No token found";
        int similarity2 = Integer.MAX_VALUE;
        String prev = getPreviousToken(parser, faultyToken).getText();
        for (var token : possibleTokens) { //possibleTokens expectedTokens.split(",")
            int a = compute_Levenshtein_distance(prev, token);
            if(a <= similarity2) {
                similarity2 = compute_Levenshtein_distance(prev, token);
                bestToken2 = token;
            }
        }

        if(text.equals("or")) {
            return "or was not expected. Declare start of if statement before by using \'implying\'";
        }

        if(similarity2 < similarity && !prev.chars().allMatch( Character::isDigit ) ) {
            return "Unexpected token: " + prev + " " + text + "\n" +
                    "We think you meant:" + bestToken2 + " " + text;
        }

        return "Unexpected token: " + text + "\n" +
                "Expecting one of: " + expectedTokens + "\n"
                + "We think you meant:" + bestToken;
    }

    static int compute_Levenshtein_distance(String str1, String str2){
        if (str1.isEmpty())
        {
            return str2.length();
        }

        if (str2.isEmpty())
        {
            return str1.length();
        }

        int replace = compute_Levenshtein_distance(
                str1.substring(1), str2.substring(1))
                + NumOfReplacement(str1.charAt(0),str2.charAt(0));

        int insert = compute_Levenshtein_distance(
                str1, str2.substring(1))+ 1;

        int delete = compute_Levenshtein_distance(
                str1.substring(1), str2)+ 1;

        return minm_edits(replace, insert, delete);
    }

    static int NumOfReplacement(char c1, char c2)
    {
        return c1 == c2 ? 0 : 1;
    }

    static int minm_edits(int... nums)
    {
        return Arrays.stream(nums).min().orElse(
                Integer.MAX_VALUE);
    }

    private String[] possibleTokens = {"invite","be","see","seeing","taste","tasting","hear","hearing","smell","smelling","spot","spotting","someone elses","about","multiple","\'th","look around","lose interest","\'s","spit","swallow","profit","call","calling","regarding","likes","think that","reconsider","implying","or sth","or","or not","let me","parent","and","is","vibe with","doesn\'t vibe with","beaten by","doesn\'t beat","beats","unbeaten by","also","alternatively","not","joined by","evolves","devolves","breeding like","times","the literal opposite of","flipped","whatever left from"};
}