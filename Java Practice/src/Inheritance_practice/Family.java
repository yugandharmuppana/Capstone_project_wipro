package Inheritance_practice;
class Srinivasarao
{
	void surname()
	{
		System.out.println("Muppana");
	}
	void flat()
	{
		System.out.println("3BHK flat");
	}
	void car()
	{
		System.out.println("BMW car");
	}
}
class Yugandhar extends Srinivasarao
{
	void bike()
	{
		System.out.println("Royal Enfield");
	}
	void job()
	{
		System.out.println("UI/UX Designer");
	}
}

public class Family {

	public static void main(String[] args) {
		Yugandhar son=new Yugandhar();
		System.out.print("Yugandhar "); son.surname();
		son.flat();
		son.car();
		son.bike();
		son.job();
	}

}