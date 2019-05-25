import stack.Stack;
import stack.StackImpl;

public class StringReverse {
    private String text;

    public StringReverse (String text) {
        this.text = text;
    }

    public String readReverse () {
        Stack<Character> stack = new StackImpl<>(text.length());
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while ( !stack.isEmpty() ) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }


}
