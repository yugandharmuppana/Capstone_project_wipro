package Collection_framework;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add(0, "Apple");
        list.add(1, "Mango");
        list.add(2, "Kiwi");
        list.add(3, "Banana");
        list.add(4, "Banana");

        System.out.println(list.get(3));
        list.set(2, "Orange");
        System.out.println(list);
        list.add(3, "Kiwi");
        System.out.println(list);
        System.out.println(list.contains("Banana"));
        System.out.println(list.equals("Banana")); // false
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf("Kiwi"));
        System.out.println(list.isEmpty());

        list.remove(0);
        System.out.println(list);
        list.remove("Kiwi");
        System.out.println(list);

        // Reverse manually using Collections
        java.util.Collections.reverse(list);
        System.out.println(list);

        // Using for-each
        for (String ch : list) {
            System.out.println(ch);
        }

        // Using iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
