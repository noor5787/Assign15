package in.ineuron.in;
import java.util.Stack;

public class StringReversal {
    public static String reverseString(String str) {
        // Create an empty stack of characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop each character from the stack and append it to a new string
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Convert the StringBuilder to a string and return it
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String S = "GeeksforGeeks";
        String reversed = reverseString(S);
        System.out.println(reversed);
    }
}
