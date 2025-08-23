package Variable_practice;

public class Employee {
	String name;
	int id;
	static String companyname="Wipro";
	void details(String name1, int id1)
	{
		name =name1;
		id= id1;
		
		System.out.println("Name of Employee = "+name);
		System.out.println("Employee ID = "+id);
		System.out.println("Company Name = "+companyname);
	}

	public static void main(String[] args) {
		Employee emp1 =new Employee();
		System.out.println("*1*");
		emp1.details("Yugandhar", 14);
		System.out.println("*2*");
		emp1.details("Prakash", 15);

	}

}
