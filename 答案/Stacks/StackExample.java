import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // create a stack
        Stack<Integer> stack = new Stack<>();

        // push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // peek at the top element
        System.out.println("Top element is: " + stack.peek());

        // pop elements from the stack
        System.out.println("Elements popped from the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}