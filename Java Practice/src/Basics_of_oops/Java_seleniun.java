package Basics_of_oops;
class SoftwareTesting
{
	void Syllabus()
	{
		System.out.println("Software testing course details");
		System.out.println("Manual testing, Core Java, Saleniun Webdriver, Jira(Project Mangament), Mysql(Database)");
		System.out.println("Fees 50000");
	}
}
class Manual extends SoftwareTesting
{
	void manual_testing()
	{
		super.Syllabus();
		System.out.println("If it is manual testing only \nthen it includes Manual testing concepts, Jira, Mysql, Postman and the fees is 30000");
	}
}
class Automation extends SoftwareTesting
{
	void automation_testing()
	{
		super.Syllabus();
		System.out.println("If it is Automation testing only \nthen it includes Core java, salenium web");
	}
}
public class Java_seleniun {

	public static void main(String[] args) {
		System.out.println("*******************Manual Testing Course Details********************");
		Manual mn=new Manual();
		
	}

}
