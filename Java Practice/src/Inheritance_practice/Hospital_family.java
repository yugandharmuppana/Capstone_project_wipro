package Inheritance_practice;
class Hospital 
{ 
	void showDepartment() 
	{
		System.out.println("This is the hospital base class");
	}
}

//Doctor branch
class Doctor extends Hospital 
{
	void showDepartment() 
	{
		System.out.println("Doctor department");
	}
}

class Gynac extends Doctor 
{
	void showDepartment() 
	{
		System.out.println("Gynaecology specialist");
	}
}

class Endo extends Doctor 
{
	void showDepartment() 
	{
		System.out.println("Endocrinology specialist");
	}
}

class Cardiac extends Doctor 
{
	void showDepartment() 
	{
		System.out.println("Cardiology department");
	}
}
//Cardiac branch
class Operation extends Cardiac 
{
	void showDepartment() 
	{
		System.out.println("Cardiac Operation unit");
	}
}

class OPD extends Cardiac 
{
	void showDepartment() 
	{
		System.out.println("Cardiac OPD unit");
	}
}

//Nurse branch
class Nurse extends Hospital 
{
	void showDepartment() 
	{
		System.out.println("Nursing department");
	}
}

//Accountant branch
class Accountant extends Hospital 
{
	void showDepartment() 
	{
		System.out.println("Accounting department");
	}
}

class Payments extends Accountant 
{
	void showDepartment() 
	{
		System.out.println("Payments section");
	}
}

class Documentation extends Accountant 
{
	void showDepartment() 
	{
		System.out.println("Documentation section");
	}
}

public class Hospital_family{

	public static void main(String[] args) {
		Hospital h = new Hospital();
	     Doctor d = new Doctor();
	     Gynac g = new Gynac();
	     Endo e = new Endo();
	     Cardiac c = new Cardiac();
	     Operation o = new Operation();
	     OPD opd = new OPD();
	     Nurse n = new Nurse();
	     Accountant a = new Accountant();
	     Payments p = new Payments();
	     Documentation doc = new Documentation();

	     h.showDepartment();
	     d.showDepartment();
	     g.showDepartment();
	     e.showDepartment();
	     c.showDepartment();
	     o.showDepartment();
	     opd.showDepartment();
	     n.showDepartment();
	     a.showDepartment();
	     p.showDepartment();
	     doc.showDepartment();
	 }
	}
