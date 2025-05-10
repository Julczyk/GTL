package Exceptions;

public class NotImplementedException extends InterpreterException {
    public NotImplementedException(String method) {
        super(method + " is stupid so we skipped it.", method + " is not yet implemented.");
    }
}
