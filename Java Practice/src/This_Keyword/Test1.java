package This_Keyword;

public class Test1 {
	Test1(String name)
	{
		System.out.println(name);
	}
	Test1()
	{
		this("Iam from Test1 Parameterized Constructor");
		System.out.println("Welcome to my space");
	}
	public static void main(String[] args) {
		Test1 t=new Test1();

	}

}
