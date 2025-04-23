package Exceptions;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

public class CustomErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        Token offendingToken = e.getOffendingToken();
        String message = "Syntax error at line " + offendingToken.getLine() + ":" + offendingToken.getCharPositionInLine()
                + " - Unexpected token '" + offendingToken.getText() + "'.";
        throw new SyntaxException(message, offendingToken.getLine(), offendingToken.getCharPositionInLine());
    }

    @Override
    public void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        Token offendingToken = e.getOffendingToken();
        String expectedTokens = e.getExpectedTokens().toString(recognizer.getVocabulary());
        String message = "Syntax error at line " + offendingToken.getLine() + ":" + offendingToken.getCharPositionInLine()
                + " - Expected one of " + expectedTokens + " but found '" + offendingToken.getText() + "'.";
        throw new SyntaxException(message, offendingToken.getLine(), offendingToken.getCharPositionInLine());
    }

    @Override
    public void reportMissingToken(Parser recognizer) {
        Token currentToken = recognizer.getCurrentToken();
        IntervalSet expectedTokens = getExpectedTokens(recognizer);
        String message = "Syntax error at line " + currentToken.getLine() + ":" + currentToken.getCharPositionInLine()
                + " - Missing token. Expected one of " + expectedTokens.toString(recognizer.getVocabulary()) + ".";
        throw new SyntaxException(message, currentToken.getLine(), currentToken.getCharPositionInLine());
    }
}

