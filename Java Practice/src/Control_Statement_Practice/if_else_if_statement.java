package Control_Statement_Practice;

public class if_else_if_statement {

	public static void main(String[] args) {
		float per=53.3f;
		if(per>=75 && per<=100)
		{
			System.out.println("Distinction");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("First Class");
		}
		else if(per>=50 && per<60)
		{
			System.out.println("Secomd Class");
		}
		else if(per>40 && per<50)
		{
			System.out.println("Pass");
		}
		else if(per>=0 && per<40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Inalid Input");
		}
	}

}
