package Variable_practice;

public class Student {
	int rollno,age;
	float per;
	String name; // instance variable /global variable
	static String collegename="JVM"; //static variable common data
	void details(int rollno1, int age1, String name1, float per1)// local variables
	{
		rollno=rollno1;
		age=age1;
		per=per1;
		name=name1;
		
		System.out.println("Rollno="+rollno);
		System.out.println("Age="+age);
		System.out.println("Percentage="+per);
		System.out.println("Name="+name);
		System.out.println("Collegename="+collegename);
	}
	public static void main(String[] args) {
		Student stud=new Student();
		System.out.println("**************1st student**************");
		stud.details(101,20, "Yugandhar Muppana", 98.8f); // for 1 student
		System.out.println("**************2nd student**************");
		stud.details(101,20, "Dana Prakash Muppana", 95.5f); // for 2 student
		
	}

}
