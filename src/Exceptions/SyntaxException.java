package Exceptions;

public class SyntaxException extends RuntimeException {
    public final String msg = "\n" + """
            
            ⠀⠀⠀⠀⠀⢠⠔⠊⠉⣉⡑⢴⠒⠉⠁⠢⡀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⢠⠃⠀⠊⠁⢀⣈⣙⣶⡀⠉⣉⣑⡢⡀⠀⠀⠀⠀⠀
            ⠀⠀⢀⡎⠏⠀⠰⢶⣊⠁⠀⠀⢀⡏⠁⠀⠀⠀⢱⠀⠀⠀⠀⠀
            ⠀⠀⡎⠀⠀⠀⠀⠈⣷⠛⢭⡭⠟⢋⣹⣽⣩⡝⠁⠀⠀⠀⠀⠀
            ⠀⢸⠀⠀⠀⠀⠀⢀⣉⡀⠀⠀⠀⠀⠀⠋⠀⢱⠀⡀⢖⡟⡖⡆
            ⠀⠸⡀⠀⠀⠀⠸⣑⣒⣒⡫⢭⣭⣶⡶⠶⠬⣵⢃⡟⠾⠘⢈⠏
            ⢀⡤⠵⣦⠄⣀⣀⣀⠀⠀⡦⡏⠇⡟⣾⢿⠉⢹⠉⢀⣀⠔⠁⠀
            ⠈⠀⠀⠀⠉⠐⠒⠒⠐⠛⠓⡥⠄⢤⠵⣏⠀⢸⠀⠀⢣⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡃⠀⢸⠀⠈⠳⡤⠆⠀⢸⡄⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀""";
    private final int line;
    private final int charPositionInLine;

    public SyntaxException(String message) {
        super(message);
        this.line = -1;
        this.charPositionInLine = -1;
    }

    public SyntaxException(String path, String codeLine, String message, int line, int charPositionInLine) {
        super(String.format("%s:%d:%d \n%s \nSyntax error at line %d:%d - %s", path, line, charPositionInLine, codeLine, line, charPositionInLine, message));
        this.line = line;
        this.charPositionInLine = charPositionInLine;
    }

    public SyntaxException(String message, int line, int charPositionInLine) {
        super(String.format("Syntax error at line %d:%d - %s", line, charPositionInLine, message));
        this.line = line;
        this.charPositionInLine = charPositionInLine;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return msg + "\n" + message;
    }

    public int getLine() {
        return line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }
}
