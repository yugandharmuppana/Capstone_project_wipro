package Inheritance_practice;
class Vehicle
{
	void start(String st)
	{
		System.out.println("start with "+st);
	}
	void stop(String st)
	{
		System.out.println("stop with "+st);
	}
	
}
class car extends Vehicle
{
	void type_of_car(String type)
	{
		System.out.println(type+" car");
	}
	void no_of_seats(int st)
	{
		System.out.println("Number of seats="+st);
	}
}
class BMW extends car
{
	void color(String color)
	{
		System.out.println("Color is="+color);
	}
}
class Audi extends car
{
	void color(String color)
	{
		System.out.println("Color is="+color);
	}
}
class Scooty extends Vehicle
{
	void type_of_Scooty(String type)
	{
		System.out.println(type+" Scooty");
	}
	void no_of_seats(int st)
	{
		System.out.println("Number of seats="+st);
	}
}
class Activa extends Scooty
{
	void speed(int sp)
	{
		System.out.println("Speed"+sp);
	}
}

public class Vehicle_family {

	public static void main(String[] args) {
		System.out.println("*****************BMW Car***************");
		BMW b=new BMW();
		b.start("Key or Button");
		b.stop("Key or Button");
		b.type_of_car("Petrol");
		b.no_of_seats(5);
		b.color("Blue");
	
		System.out.println("*****************Audi Car***************");
		Audi b1=new Audi();
		b1.start("Key or Button");
		b1.stop("Key or Button");
		b1.type_of_car("Petrol and Diesel");
		b1.no_of_seats(7);
		b1.color("While");
		
		System.out.println("*****************Activa Scooty***************");
		Activa b2=new Activa();
		b2.start("Key , Kick or Button");
		b2.stop("Key or Button");
		b2.type_of_Scooty("Petrol");
		b2.no_of_seats(2);
		b2.speed(225);
	
			
	}

}
