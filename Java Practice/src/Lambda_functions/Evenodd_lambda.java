package Lambda_functions;
interface Even
{
	boolean iseven(int num);
}
public class Evenodd_lambda {

	public static void main(String[] args) {
		Even check=(num)->num%2==0;
		System.out.println(check.iseven(-2));
		System.out.println(check.iseven(9));
	}

}
