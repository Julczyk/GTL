package Exceptions;

public class SyntaxException extends RuntimeException {
    private final int line;
    private final int charPositionInLine;

    public SyntaxException(String message) {
        super(message);
        this.line = -1;
        this.charPositionInLine = -1;
    }

    public SyntaxException(String message, int line, int charPositionInLine) {
        super(String.format("Syntax error at line %d:%d - %s", line, charPositionInLine, message));
        this.line = line;
        this.charPositionInLine = charPositionInLine;
    }

    public int getLine() {
        return line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }
}
