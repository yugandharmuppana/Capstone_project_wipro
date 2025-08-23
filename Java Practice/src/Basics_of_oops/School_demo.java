package Basics_of_oops;
class school
{
	school()
	{
		System.out.println("One particular format uniform");
		System.out.println("Follow patterns like CBSE, ICSC, and state board");
		System.out.println("Follow timing between 7 to 5");
	}
}
class DPS extends school
{
	DPS()
	{
		super();
		System.out.println("70% study and 30% sports oriented school");
	}
}
public class School_demo {

	public static void main(String[] args) {
		DPS dps=new DPS();
	}

}