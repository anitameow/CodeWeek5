// Ex1
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        // create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();
        // enqueue elements
        queue.add(1);
        queue.add(2);
        queue.add(3);
        // peek at the front element
        System.out.println("Front of the queue: " + queue.peek());
        // dequeue elements
        System.out.println("Removed from the queue: " + queue.poll());
        System.out.println("Removed from the queue: " + queue.poll());
        // check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
        // enqueue another element
        queue.add(4);
        // dequeue the remaining elements
        System.out.println("Removed from the queue: " + queue.poll());
        System.out.println("Removed from the queue: " + queue.poll());
    }
}