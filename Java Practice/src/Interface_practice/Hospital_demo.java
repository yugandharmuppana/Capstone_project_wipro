package Interface_practice;
interface Doctor
{
	void operation();
	void OPD();
}
interface Nurse
{
	void dailycheck();
	void documentation();
}
interface Accountant
{
	void payment();
	void query();
}
class patient implements Doctor, Nurse, Accountant
{
	public void operation()
	{
		System.out.println("operation");
	}
	public void OPD()
	{
		System.out.println("OPD");
	}
	public void documentation()
	{
		System.out.println("documentation");
	}
	public void dailycheck()
	{
		System.out.println("dailycheck");
	}
	public void payment()
	{
		System.out.println("payment");
	}
	public void query()
	{
		System.out.println("query");
	}
}
public class Hospital_demo {

	public static void main(String[] args) {
		patient yugandhar=new patient();
		yugandhar.operation();
		yugandhar.OPD();
		yugandhar.documentation();
		yugandhar.dailycheck();
		yugandhar.payment();
		yugandhar.query();
	}

}


