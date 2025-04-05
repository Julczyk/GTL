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

    // our interpreter supports two kinds of error messages, edgy in "meme mode" and normal in "program mode"
    public InterpreterException(String message_edgy, String message_normal) {
        super(message_edgy + "\n" + message_normal);
    }

    public void setLocation(int line, int posInLine) {
        this.line = line;
        this.posInLine = posInLine;
    }

    @Override
    public String getMessage() {
        return msg + "\nWomp womp at [" + line + ", " + posInLine + "]: " + super.getMessage();
    }

//    @Override
//    public synchronized Throwable fillInStackTrace()  { return this; }
}
