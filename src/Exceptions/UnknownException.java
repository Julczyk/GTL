package Exceptions;

/**
 * Something unknown has happened in the interpreter.
 */
public class UnknownException extends InterpreterException {

    public UnknownException(String location) {
        super("This time we messed up in: " + location + "\n But we'll fix it, probably...", "Something went wrong in the interpreter at: " + location);
    }
}