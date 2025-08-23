package Map_collections;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {
	//unordered 
	//No duplicate elements allowed it will override value for that key
	//Store null(only one null allowed)
	//elements stored on the basis of key

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("One", "Orange");
		map.put("Four", "Mango");
		map.put("Three", "Banana");
		map.put("Five", "Watermelon");
		map.put("Ten", "Muskmelon");
		map.put("Two", "Kiwi");
		map.put("Nine", "Kiwi");
		map.put(null, "Nothing");
		map.put(null, null);
		map.put("Nine", "CusturdApple"); // replace
		
		System.out.println(map);
		//System.out.println(map.get("Three"));
		
		//map.put("Four", 9);
		System.out.println(map);
		map.replace("Nine","CusturdApple");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());	
	}
}