/* write a java program using if -else stmt that checks a person's eligibility for entry an
discount offers based on the following condition
1. the person must be 18 years or older and must have an id card to be allowed entry
2.the person gets a student discount if they are under 18 or if they are a student*/

package Control_Statement_Practice;

public class if_else {

	public static void main(String[] args) {
		int age=17;
		boolean hasId=true;
		boolean isStudent=true;
		if(age>=18 && hasId)
		{
			System.out.println("This person is allowed");
		}
		else
		{
			System.out.println("This person is not allowed and eligible for student discount");
		}

	}

}
