package Collection_framework;

// ArrayDeque:
// - Follows FIFO order by default
// - Allows duplicate elements
// - Does NOT allow null elements (throws NullPointerException)
// - Stores elements in insertion order (not based on hash code)

import java.util.ArrayDeque;

public class ArrayDeque_demo {

    public static void main(String[] args) {
        ArrayDeque<String> q = new ArrayDeque<String>();

        // Adding elements
        q.add("Apple");
        q.add("Mango");
        q.add("Watermelon");
        q.add("Kiwi");
        q.add("Mango");

        System.out.println("Initial Deque:");
        System.out.println(q);  // Maintains insertion order

        // Accessing first and last elements
        System.out.println("First element: " + q.getFirst());
        System.out.println("Last element: " + q.getLast());

        // Offer adds at the end
        q.offer("Banana");
        System.out.println("After offer('Banana'):");
        System.out.println(q);

        // Add at beginning and end
        q.offerFirst("MuskMelon");
        q.offerLast("Orange");
        System.out.println("After offerFirst and offerLast:");
        System.out.println(q);

        // Remove first and last elements
        q.pollFirst();  // removes MuskMelon
        q.pollLast();   // removes Orange
        System.out.println("After pollFirst() and pollLast():");
        System.out.println(q);

        // Peek head element
        System.out.println("Peek (head): " + q.peek());

        // Remove specific element
        q.remove("Mango");
        System.out.println("After removing one 'Mango':");
        System.out.println(q);

        // Clear the deque
        q.clear();
        System.out.println("After clearing:");
        System.out.println(q);
    }
}
