package Collection_framework;

import java.util.LinkedList;

public class CloneListExample {
    
    public static void main(String[] args) {
    	//LinkedList of numbers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Clone using clone()
        LinkedList<Integer> clonedList = (LinkedList<Integer>) numbers.clone();

        // Display both
        System.out.println("Original LinkedList: " + numbers);
        System.out.println("Cloned LinkedList: " + clonedList);
    }
}
