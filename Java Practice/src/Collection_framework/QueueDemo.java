package Collection_framework;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("Apple");//1
		q.add("Mango");
		q.add("Banana");
		q.add("Watermelon");
		q.add("Kiwi");
		q.add("CusturdApple");
		System.out.println(q);
		q.poll();//remove apple
		System.out.println(q);
		q.poll();// remove banana
		
		System.out.println(q);
		q.poll();
		System.out.println(q);
//		System.out.println(q.element());
//		q.offer("Banana");
//		System.out.println(q);
//		System.out.println(q.peek());
//		System. //q.clear();
//		q.poll();
//		System.out.println(q);
//		q.remove();
// 		System.out.println(q);
		
	}

}



