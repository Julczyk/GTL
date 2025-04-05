/**
 * Variable has not been declared.
 */
public class VariableNotFoundException extends InterpreterException {
    public VariableNotFoundException(String message_edgy, String message_normal) {
        super(message_edgy, message_normal);
    }
}
