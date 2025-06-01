package Exceptions;

public class OutOfBoundsException extends InterpreterException {
    public OutOfBoundsException(String message_edgy, String message_normal) {
        super(message_edgy, message_normal);
    }
}
