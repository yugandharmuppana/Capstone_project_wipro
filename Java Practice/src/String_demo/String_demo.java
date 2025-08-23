package String_demo;

public class String_demo {

	public static void main(String[] args) {
		String st="Hello";// current memory allocation is 19 bits
		System.out.println(st.charAt(2));//1
		System.out.println(st.codePointAt(1));//return ascii value
		System.out.println(st.codePointBefore(1));
		System.out.println(st.codePointCount(0, 3));
		System.out.println(st.equals("hello"));
		System.out.println(st.equalsIgnoreCase("hello"));
		System.out.println(st.isBlank());
		System.out.println(st.isEmpty());
		System.out.println(st.lastIndexOf("o"));
		System.out.println(st.contains("lo"));
	}
}