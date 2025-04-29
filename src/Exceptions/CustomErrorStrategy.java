package Exceptions;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.util.stream.Collectors;

public class CustomErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        Token offendingToken = e.getOffendingToken();
        //String message = "Unexpected token '" + offendingToken.getText() + " Maybe you need " + e.getExpectedTokens().toString() +  "'." ;
        String expected = readableExpectedTokens(e.getExpectedTokens(), recognizer.getVocabulary());
        String message = String.format("Unexpected token '%s' at line %d:%d. Expected one of: %s.",
                offendingToken.getText(),
                offendingToken.getLine(),
                offendingToken.getCharPositionInLine(),
                expected);

        throw new SyntaxException(message, offendingToken.getLine(), offendingToken.getCharPositionInLine());
    }

    @Override
    public void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        Token offendingToken = e.getOffendingToken();
        Token previousToken = getPreviousToken(recognizer);

        if (previousToken != null && "is".equals(previousToken.getText())) {
            String msg = String.format(
                    "Syntax error at line %d:%d → Expected an expression after '%s'.",
                    offendingToken.getLine(),
                    offendingToken.getCharPositionInLine(),
                    previousToken.getText()
            );
            throw new SyntaxException(msg, offendingToken.getLine(), offendingToken.getCharPositionInLine());
        }

        super.reportInputMismatch(recognizer, e);
    }


    @Override
    public void reportMissingToken(Parser recognizer) {
        Token currentToken = recognizer.getCurrentToken();
        IntervalSet expectedTokens = getExpectedTokens(recognizer);
        String message = "Missing token. Expected one of " + readableExpectedTokens(expectedTokens, recognizer.getVocabulary()) + ".";
        throw new SyntaxException(message, currentToken.getLine(), currentToken.getCharPositionInLine());
    }

    @Override
    public void reportUnwantedToken(Parser recognizer) {
        Token offendingToken = recognizer.getCurrentToken();
        Token previousToken = getPreviousToken(recognizer);

        if (previousToken != null && "is".equals(previousToken.getText())) {
            String msg = String.format("Expected an expression after '%s'.", previousToken.getText());
            throw new SyntaxException(msg, offendingToken.getLine(), offendingToken.getCharPositionInLine());
        }

        super.reportUnwantedToken(recognizer);
    }


    private String readableExpectedTokens(IntervalSet expected, Vocabulary vocabulary) {
        return expected.toList().stream()
                .map(vocabulary::getDisplayName)
                .collect(Collectors.joining(", "));
    }

    private Token getPreviousToken(Parser recognizer) {
        TokenStream tokens = recognizer.getInputStream();
        if (tokens == null) return null;

        int index = tokens.index();
        if (index > 0) {
            Token prevToken = tokens.get(index - 1);
            return (prevToken != null && prevToken.getType() != Token.EOF) ? prevToken : null;
        }
        return null;
    }

}

