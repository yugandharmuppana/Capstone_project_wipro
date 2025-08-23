//Covert ArrayList to Array

package Collection_framework;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertToArray {

	public static void main(String[] args) {
		 ArrayList<String> flowers = new ArrayList<>();
	        flowers.add("Rose");
	        flowers.add("Jasmine");
	        flowers.add("Lilly");

	        String[] flowersArray = new String[flowers.size()];
	        flowersArray = flowers.toArray(flowersArray);

	        System.out.println("Converted Array: " + Arrays.toString(flowersArray));
	    }
	}
