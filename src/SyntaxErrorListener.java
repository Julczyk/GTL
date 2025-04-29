//package ../GreenTextLangParser.java;
import Exceptions.SyntaxException;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.*;

import java.util.Arrays;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener {
    private final List<String> sourceLines;
    //public static final SyntaxErrorListener INSTANCE = new SyntaxErrorListener();

    public SyntaxErrorListener(String sourceLines) {
        this.sourceLines = Arrays.stream(sourceLines.split("\\r?\\n")).toList();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        //System.err.println(e.getClass());

        if (recognizer instanceof GreenTextLangParser) {
            CommonToken token = (CommonToken) offendingSymbol;
            GreenTextLangParser parser = (GreenTextLangParser) recognizer;
            ParserRuleContext ctx = parser.getRuleContext();
            String rulename = parser.getRuleNames()[ctx.getRuleIndex()];

            String message = tryToResolveError(parser, token, rulename, e);
            //throw new SyntaxException("fasfs");
            //System.out.println(ExpectedTokens(parser));

            String codeLine = sourceLines.get(line - 1) + "\n" +
                    " ".repeat(charPositionInLine) +
                    "^".repeat(token.getText().length());

            //System.out.println(rulename + " " + token.getText() + " " + ctx.start.getText());
            throw new SyntaxException(codeLine, message==null ? msg : message, line, charPositionInLine);
        } else {

            GreenTextLangLexer lexer = (GreenTextLangLexer) recognizer; // Cast recognizer to lexer, because it's lexer's stage

            CodePointCharStream charStream = (CodePointCharStream) lexer.getInputStream(); // Retrieve input stream at the time of an error

            String errorChar = new String(Character.toChars(charStream.LA(1))); //Return char that caused the error
            // Using Character class to handle extended Unicode character (e.g. emojis)

            throw new SyntaxException("Unrecognized character: " + errorChar, lexer.getLine(), lexer.getCharPositionInLine());
        }
        // throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }

    private String ExpectedTokens(Parser parser) {

//        ArrayList<String> expectedTokens = new ArrayList<>();
//
//        if (parser.getExpectedTokens() == null) {
//            return null;
//        }

        IntervalSet tokens = parser.getExpectedTokens();

//        for (int i = 0; i < tokens.size() - 1; i++) {
//            expectedTokens.add(parser.getVocabulary().getDisplayName(tokens.get(i)));
//        }
        return tokens.toString(parser.getVocabulary());

    }

    public String tryToResolveError(GreenTextLangParser parser, CommonToken faultyToken, String rulename, RecognitionException e) {
        ParserRuleContext ctx = parser.getRuleContext();
        String tokenTypeName = getLexemName(faultyToken);
        String tokens = ExpectedTokens(parser);

        //System.out.println(ctx.start.getText() + " " + ctx.getText() + " " + faultyToken.getText() + " " + rulename + " " + tokenTypeName);


        if (e instanceof NoViableAltException) {
            String text = faultyToken.getText();
            String errorMsg = String.format("Unexpected token '%s'.", text);
            return errorMsg;
        }

//        if (e instanceof MissingTokenException){
//            Token currentToken = parser.getCurrentToken();
//            IntervalSet expectedTokens = getExpectedTokens(parser);
//            String message = "Missing token. Expected one of " + readableExpectedTokens(expectedTokens, parser.getVocabulary()) + ".";
//            throw new SyntaxException(message, currentToken.getLine(), currentToken.getCharPositionInLine());
//        }

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
        System.out.println(rulename + " faulty: " + faultyToken.getText() + " token type" + tokenTypeName +  ctx.getParent());
        if(rulename.equals("code_blocks") && faultyToken.getText().equals("profit")) {
            return "If expression not closed";
        }
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

        if(e.getCause() instanceof InputMismatchException) {
            InputMismatchException inputMismatchException = (InputMismatchException) e.getCause();
            String msg = inputMismatchException.getMessage();
            return msg;
        }



        return "Unrecognized character: " + faultyToken.getText();
    }

    private String getLexemName(CommonToken token) {
        return GreenTextLangParser.VOCABULARY.getSymbolicName(token.getType());
    }
}


//package Exceptions;
//
//import org.antlr.v4.runtime.*;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class SyntaxErrorListener extends BaseErrorListener {
//    public static final SyntaxErrorListener INSTANCE = new SyntaxErrorListener();
//
//    private final Map<String, String> suggestions = new HashMap<>();
//    private final Set<String> operators = Set.of("is", "flipped", "plus");
//
//    private SyntaxErrorListener() {
//        suggestions.put("iz", "is");
//        suggestions.put("flipt", "flipped");
//        suggestions.put("iss", "is");
//        suggestions.put("pluz", "plus");
//    }
//
//    @Override
//    public void syntaxError(Recognizer<?, ?> recognizer,
//                            Object offendingSymbol,
//                            int line,
//                            int charPositionInLine,
//                            String msg,
//                            RecognitionException e) {
//        String tokenText = getTokenText(offendingSymbol);
//        if (isEOFOrEmpty(tokenText)) {
//            handleEOF(recognizer, line, charPositionInLine);
//        } else {
//            handleUnexpectedToken(tokenText, line, charPositionInLine);
//        }
//    }
//
//    protected void handleEOF(Recognizer<?, ?> recognizer, int line, int charPositionInLine) {
//        TokenStream tokens = (TokenStream) recognizer.getInputStream();
//        Token previousToken = findPreviousToken(tokens);
//
//        if (previousToken != null && operators.contains(previousToken.getText())) {
//            throw new SyntaxException(
//                    String.format("Syntax error at line %d:%d → Expected an expression after '%s'.", line, charPositionInLine, previousToken.getText()),
//                    line, charPositionInLine
//            );
//        }
//
//        throw new SyntaxException(
//                String.format("Syntax error at line %d:%d → Incomplete statement.", line, charPositionInLine),
//                line, charPositionInLine
//        );
//    }
//
//    protected void handleUnexpectedToken(String tokenText, int line, int charPositionInLine) {
//        String suggestion = suggestions.get(tokenText);
//        StringBuilder errorMessage = new StringBuilder();
//        errorMessage.append(String.format("Syntax error at line %d:%d → Unexpected token '%s'.", line, charPositionInLine, tokenText));
//
//        if (suggestion != null) {
//            errorMessage.append(" Did you mean '").append(suggestion).append("'?");
//        }
//
//        throw new SyntaxException(errorMessage.toString(), line, charPositionInLine);
//    }
//
//    protected String getTokenText(Object offendingSymbol) {
//        return (offendingSymbol instanceof Token) ? ((Token) offendingSymbol).getText() : "unknown";
//    }
//
//    protected boolean isEOFOrEmpty(String tokenText) {
//        return tokenText.equals("<EOF>") || tokenText.trim().isEmpty() || tokenText.equals("\n") || tokenText.equals("\r");
//    }
//
//    protected Token findPreviousToken(TokenStream tokens) {
//        int index = tokens.index();
//        while (index > 0) {
//            Token candidate = tokens.get(index - 1);
//            if (!candidate.getText().trim().isEmpty() && !candidate.getText().equals("<EOF>")) {
//                return candidate;
//            }
//            index--;
//        }
//        return null;
//    }
//}



//package Exceptions;
//
//import org.antlr.v4.runtime.*;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class SyntaxErrorListener extends BaseErrorListener {
//    public static final SyntaxErrorListener INSTANCE = new SyntaxErrorListener();
//
//    private final Map<String, String> suggestions = new HashMap<>();
//    private final Set<String> operators = Set.of("is", "flipped", "plus");
//
//    private SyntaxErrorListener() {
//        // Initialize common typos and their corrections
//        suggestions.put("iz", "is");
//        suggestions.put("flipt", "flipped");
//        suggestions.put("iss", "is");
//        suggestions.put("pluz", "plus");
//        // Add more as needed
//    }
//
//    @Override
//    public void syntaxError(Recognizer<?, ?> recognizer,
//                            Object offendingSymbol,
//                            int line,
//                            int charPositionInLine,
//                            String msg,
//                            RecognitionException e) {
//
//        String tokenText = (offendingSymbol instanceof Token) ? ((Token) offendingSymbol).getText() : "unknown";
//
//        // Handle cases where the offending token is EOF or a newline
//        if (tokenText.equals("<EOF>") || tokenText.trim().isEmpty() || tokenText.equals("\n") || tokenText.equals("\r") || tokenText.equals("\r\n")) {
//            TokenStream tokens = (TokenStream) recognizer.getInputStream();
//            int index = tokens.index();
//            Token previousToken = null;
//
//            // Traverse backwards to find the last meaningful token
//            while (index > 0) {
//                Token candidate = tokens.get(index - 1);
//                String candidateText = candidate.getText();
//                if (!candidateText.equals("<EOF>") && !candidateText.trim().isEmpty()) {
//                    previousToken = candidate;
//                    break;
//                }
//                index--;
//            }
//
//            if (previousToken != null) {
//                String prevText = previousToken.getText();
//                if (operators.contains(prevText)) {
//                    throw new SyntaxException(
//                            String.format("Syntax error at line %d:%d → Expected an expression after '%s'.", line, charPositionInLine, prevText),
//                            line,
//                            charPositionInLine
//                    );
//                }
//            }
//
//            // Generic incomplete statement error
//            throw new SyntaxException(
//                    String.format("Syntax error at line %d:%d → Incomplete statement.", line, charPositionInLine),
//                    line,
//                    charPositionInLine
//            );
//        }
//
//        // Handle unexpected tokens with suggestions
//        String suggestion = suggestions.getOrDefault(tokenText, null);
//
//        StringBuilder errorMessage = new StringBuilder();
//        errorMessage.append(String.format("Syntax error at line %d:%d → Unexpected token '%s'.",
//                line, charPositionInLine, tokenText));
//
//        if (suggestion != null) {
//            errorMessage.append(" Did you mean '").append(suggestion).append("'?");
//        }
//
//        throw new SyntaxException(errorMessage.toString(), line, charPositionInLine);
//    }
//}
//
//
////package Exceptions;
////
////
////
//////import org.antlr.v4.runtime.ANTLRErrorListener;
//////import org.antlr.v4.runtime.Parser;
//////import org.antlr.v4.runtime.RecognitionException;
//////import org.antlr.v4.runtime.Recognizer;
//////import org.antlr.v4.runtime.atn.ATNConfigSet;
//////import org.antlr.v4.runtime.dfa.DFA;
//////
//////import java.util.BitSet;
////
////import org.antlr.v4.runtime.*;
////
////public class SyntaxErrorListener extends BaseErrorListener {
////    public static SyntaxErrorListener INSTANCE = new SyntaxErrorListener();
////
////    private SyntaxErrorListener() {
////        // Singleton pattern to prevent multiple instances
////    }
////
////    @Override
////    public void syntaxError(
////            Recognizer<?, ?> recognizer,
////            Object offendingSymbol,
////            int line,
////            int charPositionInLine,
////            String msg,
////            RecognitionException e
////    ) {
////        throw new SyntaxException(msg, line, charPositionInLine);
////    }
//////    private String errorMsg = "";
//////    @Override
//////    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int line, int charPositionInLine, String msg, RecognitionException e) {
//////
//////        String sourceName = recognizer.getInputStream().getSourceName();
//////        if (!sourceName.isEmpty()) {
//////            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
//////        }
//////
//////        System.err.println(sourceName+"line "+line+":"+charPositionInLine+" "+msg);
//////        errorMsg = errorMsg + "\n" + sourceName+"line "+line+":"+charPositionInLine+" "+msg;
//////        throw new SyntaxException(errorMsg);
//////    }
//////
//////    @Override
//////    public void reportAmbiguity(Parser parser, DFA dfa, int line, int charPositionInLine, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
//////
//////    }
//////
//////    @Override
//////    public void reportAttemptingFullContext(Parser parser, DFA dfa, int line, int charPositionInLine, BitSet bitSet, ATNConfigSet atnConfigSet) {
//////
//////    }
//////
//////    @Override
//////    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
//////
//////    }
////
//////    @Override
//////    public String toString() {
//////        return errorMsg;
//////    }
////}
