/**
 * Type mismatch error.
 */
public class TypeException extends InterpreterException {

    public TypeException(String message_edgy, String message_normal) {
        super(message_edgy, message_normal);
    }
}