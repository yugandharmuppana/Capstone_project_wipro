package Collection_framework;

import java.util.LinkedList;
import java.util.ArrayList;

public class ConvertToArrayList {
    
    public static void main(String[] args) {
    	//LinkedList of Strings
        LinkedList<String> names = new LinkedList<>();
        names.add("Siyaan");
        names.add("Bowshika");
        names.add("Eeshaan");

        // Convert LinkedList to ArrayList
        ArrayList<String> nameArray = new ArrayList<>(names);

        // Display both
        System.out.println("LinkedList: " + names);
        System.out.println("ArrayList: " + nameArray);
    }
}
