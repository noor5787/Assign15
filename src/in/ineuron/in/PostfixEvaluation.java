package in.ineuron.in;
import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression1 = "231*+9-";
        int result1 = evaluatePostfix(postfixExpression1);
        System.out.println("Result 1: " + result1);

        String postfixExpression2 = "123+*8-";
        int result2 = evaluatePostfix(postfixExpression2);
        System.out.println("Result 2: " + result2);
    }
}
