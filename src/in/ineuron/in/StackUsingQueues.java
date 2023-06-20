package in.ineuron.in;
import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element onto the stack
    public void push(int value) {
        q1.add(value);
    }

    // Remove and return the top element of the stack
    public int pop() {
        if (q1.isEmpty())
            return -1;

        // Move elements from q1 to q2 except the last one
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Remove and return the last element from q1 (which is the top of the stack)
        int poppedElement = q1.remove();

        // Swap the references of q1 and q2, so that q2 becomes empty for the next operation
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // Output: 3
        stack.push(4);
        System.out.println(stack.pop()); // Output: 4

        stack = new StackUsingQueues();
        stack.push(2);
        System.out.println(stack.pop()); // Output: 2
        System.out.println(stack.pop()); // Output: -1
        stack.push(3);
        System.out.println(stack.pop()); // Output: 3
    }
}
