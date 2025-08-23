//Create ArrayList and search for an element

package Collection_framework;
import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<>();
        items.add("Pen");
        items.add("Pencil");
        items.add("Eraser");

        String search = "Pen";

        if (items.contains(search)) {
            System.out.println(search + " found in the list.");
        } else {
            System.out.println(search + " not found in the list.");
        }
    }
}
