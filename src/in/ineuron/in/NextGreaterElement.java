package in.ineuron.in;
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] result = findNextGreaterElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Iterate the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack until a greater element is found or the stack is empty
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, there is no greater element on the right
            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = stack.peek();
            }

            // Push current element to the stack
            stack.push(arr[i]);
        }

        return nextGreater;
    }
}
