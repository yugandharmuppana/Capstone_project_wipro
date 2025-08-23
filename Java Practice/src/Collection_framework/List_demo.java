package Collection_framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class List_demo {
	public static void main(String[] args) 
	{
		//Add Group of elements with List interface method "of"
		ArrayList<Integer> list=new ArrayList<>(List.of(50,70,80,40,50));
		Collections.sort(list);
		System.out.println(list);
		List<String> list1=new ArrayList<String>();
		list1.add(0, "Apple");
		list1.add(1, "Mango");
		list1.add(2, "Kiwi");
		list1.add(3, "Banana"); // String
		System.out.println(list);
		System.out.println(list.get(3));
		list1.set(2, "Orange"); // replace current element
		System.out.println(list);
		list1.add(3, "Kiwi");//add element on particular index
		System.out.println(list);
		System.out.println(list.contains("Banana"));
		System.out.println(list.equals("Banana"));//false
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("Kiwi"));
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.remove("Kiwi");
		System.out.println(list);
		System.out.println(list.reversed());
		for (String ch:list1)
		{
		System.out.println(ch);
		}
		//Using iterator
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		// Using ListIterator
		Iterator<String> itrs=list1.listIterator();
		while(itrs.hasNext())
		{
		System.out.println(itrs.next());
		}
	}

}
