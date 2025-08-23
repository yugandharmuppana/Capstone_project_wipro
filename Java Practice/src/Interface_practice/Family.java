package Interface_practice;
interface Parent1
{
	void flat();
	void car();
}
interface Parent2
{
	void flat();
	void bike();
}
class child implements Parent1, Parent2
{
	public void bike()
	{
		System.out.println("Sports bike");
	}
	public void flat()
	{
		System.out.println("2BHK flat");
	}
	public void car()
	{
		System.out.println("Sports car");
	}
}
public class Family {

	public static void main(String[] args) {
		child yugandhar=new child();
		yugandhar.bike();
		yugandhar.car();
		yugandhar.flat();
	}
}
