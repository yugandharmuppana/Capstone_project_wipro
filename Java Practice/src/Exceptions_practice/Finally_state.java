package Exceptions_practice;

public class Finally_state {
	public static void main(String[] args) {
		try
		{
			int[] a=new int[4];
			System.out.println(a[6]);//ArrayIndexoutOfBoundException
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Important code");
		}
		System.out.println("End");
	}
}