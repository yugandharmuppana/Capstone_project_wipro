/*check if a student is eligible for a scholarship
* 1. a student must have score above 80 or must be from reserved category
*
* output=Scholarship granted or
* not eligible for the scholarship*/

package Control_Statement_Practice;

public class if_else_task3 {

	public static void main(String[] args) {
		int score=80;
		boolean isReservedCategory=false;
		if (score>80 || isReservedCategory)
		{
			System.out.println("Scholarship is granted");
		}
		else
		{
			System.out.println("Not eligible for this scholarship");
		}
		
	}

}
