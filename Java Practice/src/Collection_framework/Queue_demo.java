package Collection_framework;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_demo {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<String>();

        // Adding elements
        q.add("Apple");
        q.add("Mango");
        q.add("Watermelon");
        q.add("Kiwi");
        q.add("CusturdApple");

        System.out.println("Queue after adding elements:");
        System.out.println(q);  // Elements may not be in insertion order due to priority sorting

        // Retrieve head without removing
        System.out.println("Head using element(): " + q.element());

        // Offer adds element at the correct position based on priority
        q.offer("Banana");

        System.out.println("Queue after offering 'Banana':");
        System.out.println(q);

        // Peek returns the head without removal
        System.out.println("Head using peek(): " + q.peek());

        // Remove and return the head
        q.poll();
        System.out.println("Queue after poll():");
        System.out.println(q);

        // Remove head using remove()
        q.remove();
        System.out.println("Queue after remove():");
        System.out.println(q);

        // Remove specific element
        q.remove("Kiwi");
        System.out.println("Queue after removing 'Kiwi':");
        System.out.println(q);
    }
}
