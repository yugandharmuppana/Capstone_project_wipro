package Encapsulation_practice;

public class Student {
	private String name="Yugandhar Muppana";
		private int age=22;
		public String setname()
		{
			return name;
		}
		public int setage()
		{
			return age;
		}
		public void getnameage()
		{
			System.out.println(name);
			System.out.println(age);
		}
	 
		public static void main(String[] args) 
		{
			Student s=new Student();
			s.getnameage();
		}
	 
	}