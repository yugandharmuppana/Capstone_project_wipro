package Enum_practice;

public class Enum_week {
	enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
	public static void main(String[] args) {
		Day D=Day. Wednesday;
		switch(D) 
		{
			case Monday: System.out.println("Monday");
			break;
			case Tuesday: System.out.println("Tuesday"); 
			break;
			case Wednesday: System.out.println("Wednesday"); 
			break;
			case Thursday: System.out.println("Thursday"); 
			break;
			case Friday: System.out.println("Friday"); 
			break;
			case Saturday: System.out.println("Saturday"); 
			break;
			case Sunday: System.out.println("Sunday"); 
			break;
		}
		if(D==Day.Saturday || D==Day.Sunday) 
		{
			System.out.println("It is weekend");
		}
		else 
		{
			System.out.println("It is weekday"); }
		}
}