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
            if(rulename.equals("code_blocks")) {
                return findNotClosedStatement(parser, faultyToken);
//                return "If expression not closed, expecting one of: {'or sth', 'or', 'or not'}" + "\n"
//                        + ctx.getText() + "\n"
//                        + ctx.getParent().getText() + "\n"
//                        + expectedTokens + "\n"
//                        + rulename + "\n"
//                        + ((NoViableAltException) e).getDeadEndConfigs().getStates() + "\n"
//                        + faultyToken.getTokenIndex() + "\n"
//                        + findNotClosedStatement(parser, faultyToken);
            }
            return "Unexpected token: " + text + "\n" +
                    "Expecting one of: " + expectedTokens + "\n"
                    + rulename + "\n"
                    + e + "\n"
                    + faultyToken.getText();
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

    private String findNotClosedStatement(Parser recognizer, CommonToken faultyToken) {
        TokenStream tokens = recognizer.getInputStream();
        if (tokens == null) return null;
        int index = faultyToken.getTokenIndex();
        int[] closing = {0,0,0,0}; // if, fun, loop, ors from if
        while (index > 0){
            if (tokens.get(index).getText().equals("implying")) {
                closing[3] = 0;
                closing[0]++;
            }else if (tokens.get(index).getText().equals("or sth")) {
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



        return tokens.toString();
    }
}