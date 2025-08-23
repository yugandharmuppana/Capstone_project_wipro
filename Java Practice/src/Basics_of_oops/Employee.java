package Basics_of_oops;

public class Employee {
	Employee()// no argument constructor
	{
		System.out.println("Default constructor");
	}
	Employee(int id, String name)// parameterized constructor
	{
		System.out.println("Id id="+id);
		System.out.println("Name is="+name);
	}
	Employee(String name, int id)// parameterized constructor
	{
		System.out.println("Name is="+name);
		System.out.println("Id id="+id);
	}
	Employee(String name, int id, float salary)// parameterized constructor
	{
		System.out.println("Name is="+name);
		System.out.println("Id id="+id);
		System.out.println("Salary="+salary);
	}
	public static void main(String[] args) {
		Employee emp=new Employee("Yugandhar Muppana", 12,50000);
	}

}
