package stack;

public class StackOverloadException extends RuntimeException {

    public StackOverloadException() {
        super("stack.stack is full");
    }
}
