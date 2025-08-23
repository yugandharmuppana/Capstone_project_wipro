package Type_casting;
class Test
{
	void show()
	{
		System.out.println("Hello");
	}
}
class Test1 extends Test
{
	void dispaly() 
	{
		System.out.println("Welcome");
	}
	void show()
	{		
		System.out.println("How are you?");
	}
}
public class Test_demo {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.show();
		Test t=new Test1();// upcasting
		t.show();
		Test1  tt=(Test1)t;// downcasting
		tt.dispaly();
		tt.show();
	}

}
