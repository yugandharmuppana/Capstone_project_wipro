package Pass_value_reference;

public class TestPass {

	public static void changepassword(String password)
	{
		password="NewPassword";
	}
	public static void main(String[] args) {
		
	String password="OldPassword";
	changepassword(password);// Pass reference
	System.out.println("Password method="+password);
	}
}