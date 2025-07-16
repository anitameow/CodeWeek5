// Ex5a
import java.util.Arrays;
public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;
    // constructor to initialize the stack
    public StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    // method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top = top + 1;
        stack[top] = value;
    }
    // method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int temp = top;
        top = top - 1;
        return stack[temp];
    }
    // method to check the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    // method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    // method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
    // print the stack
    public void printStack(){
        System.out.println(Arrays.toString(this.stack));
    }
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Top element is: " + stack.peek());
        //stack.printStack();
        System.out.println("Elements popped from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            //stack.printStack();//打印看了，没有区别，pop是修改了指针top，并没有清除数组里的值。
        }
        // 现在是“空的” [10, 20, 30, 40, 50]
        stack.push(999); // [999, 20, 30, 40, 50]
        stack.printStack(); 
    }
}