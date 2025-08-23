/*write a program to check temperature and display message like
* 40c --> "Very hot
* 30-40c-->HOt
* 20-29c-->warm
* 10-19c-->Cool
* <10c-->very cool*/

package Control_Statement_Practice;

public class if_else_if_statement_task1 {

	public static void main(String[] args) {
		float temp=9.0f;
		if(temp>=40)
		{
			System.out.println("It is Very Hot");
		}
		else if(temp>=30 && temp>40)
		{
			System.out.println("It is Hot");
		}
		else if(temp>=20 && temp<30)
		{
			System.out.println("It is Warm");
		}
		else if(temp>=10 && temp<20)
		{
			System.out.println("It is Cool");
		}
		else
		{
			System.out.println("It is Very Cool");
		}
	}

}
