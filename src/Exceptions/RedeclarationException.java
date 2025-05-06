package Exceptions;

public class RedeclarationException extends InterpreterException {
    public RedeclarationException(String message_edgy, String message_normal) {
        super(message_edgy, message_normal);
    }
}