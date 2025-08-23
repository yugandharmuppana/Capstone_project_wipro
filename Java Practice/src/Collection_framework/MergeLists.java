//Merge two ArrayList and remove duplicate elements

package Collection_framework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Pen");
        list1.add("Pencil");
        list1.add("Eraser");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Sharpener");
        list2.add("Pen");
        list2.add("Scale");

        list1.addAll(list2); 

        Set<String> uniqueItems = new LinkedHashSet<>(list1); 

        System.out.println("Merged List without Duplicates: " + uniqueItems);
    }
}
