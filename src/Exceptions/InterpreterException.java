package Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 * Base exception for interpreter runtime errors.
 */
public abstract class InterpreterException extends RuntimeException {

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
    private int line;
    private int posInLine;
    private Path filePath;

    // our interpreter supports two kinds of error messages, edgy in "meme mode" and normal in "program mode"
    public InterpreterException(String message_edgy, String message_normal) {
        super(message_edgy + "\n" + message_normal);
    }

    public void setLocation(int line, int posInLine, Path filePath) {
        this.line = line;
        this.posInLine = posInLine;
        this.filePath = filePath;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        String meme = message.split("\n")[0];
        String prog = message.split("\n")[1];
        String input = null;
        try {
            input = Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> sourceLines = Arrays.stream(input.split("\\r?\\n")).toList();
        String codeLine = sourceLines.get(line - 1) + "\n" +
                            " ".repeat(posInLine) + "^";
        return msg + "\n" +
                filePath + ":" + line + ":" + posInLine + "\n" +
                codeLine +
                "\nWomp womp at [" + line + ", " + posInLine + "]: " + meme +
                         "\nError at [" + line + ", " + posInLine + "]: " + prog;
    }

    @Override
    public synchronized Throwable fillInStackTrace()  { return this; }
}
