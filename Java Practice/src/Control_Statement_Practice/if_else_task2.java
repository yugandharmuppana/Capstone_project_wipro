/*print weekdays if it is mon, tue, wed, thu, fri
* else print weekend*/

package Control_Statement_Practice;

public class if_else_task2 {

	public static void main(String[] args) {
		String day="Sun";
		if(day=="Sat"||day=="Sun")
		{
			System.out.println("Weekend");
		}
		else
			System.out.println("Weekday");
	}

}
