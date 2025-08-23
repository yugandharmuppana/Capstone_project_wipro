/*write a program for dress size
* like 26=extra small
* 28=small size
* 30=medium
* 32=large
* 34=Extra large
* 36=extra extra large..
*/

package Control_Statement_Practice;

public class Switch_practice_task1 {

	public static void main(String[] args) {
		int shirtsize=34;
		switch(shirtsize)
		{
		case 26:System.out.println("Extra Small Size");
		break;
		case 28:System.out.println("Small Size");
		break;
		case 30:System.out.println("Medium Size");
		break;
		case 32:System.out.println("Large Size");
		break;
		case 34:System.out.println("Extra Large Size");
		break;
		case 36:System.out.println("Extra Extra Large Size");
		break;
		default:System.out.println("Invalid Dress Size");
		}
	}
}
