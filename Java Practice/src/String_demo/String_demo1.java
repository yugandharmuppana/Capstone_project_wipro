package String_demo;

public class String_demo1 {

	public static void main(String[] args) {
		String str="Hello";
		//Covert String to StringBuffer or StringBuilder
		//immutable String to Mutable string
		StringBuffer sb=new StringBuffer(str);
		sb.append(" Dear");
		System.out.println(sb);
		sb.append(" Students");
		System.out.println(sb);
		
	}

}
