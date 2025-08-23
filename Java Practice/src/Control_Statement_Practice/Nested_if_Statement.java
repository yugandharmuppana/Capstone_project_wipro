package Control_Statement_Practice;

public class Nested_if_Statement {

	public static void main(String[] args) {
		boolean isreg=true;
		boolean hashallticket=false;
		if(isreg)
		{
			if(hashallticket)
			{
				System.out.println("You can write your exam");
			}
			else
			{
				System.out.println("You need a hall ticket");
			}
		}
		else
		{
			System.out.println("You are not registered");
		}
	}

}