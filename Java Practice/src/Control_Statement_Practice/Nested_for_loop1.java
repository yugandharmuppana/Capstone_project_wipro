//Right angle triangle

package Control_Statement_Practice;

public class Nested_for_loop1 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)//i=0, 1, 2, 3, 4, 5=false
		{
			for(int j=0;j<=i;j++)//j=0, 1, 2, 3, 4, 5=false
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
