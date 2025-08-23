package This_Keyword;

public class Test {
	void setname(String name)
	{
		System.out.println(name);
	}
	void getname()
	{
		this.setname("Yugandhar Muppana");
		System.out.println("Welcome to Java Learning Sessions");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.getname();
	}

}
