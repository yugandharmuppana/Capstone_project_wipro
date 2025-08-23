package Interface_practice;
interface Animal
{
	String name="Animal family";
	String name1="Animal family";
	int a=10;
	void eat();// public and abstract
	void sound();
	default void show()
	{
		System.out.println("Hello");
	}
}
class Dog implements Animal
{
	public void eat()
	{
		System.out.println("Pedigree");
	}
	public void sound()
	{
		System.out.println("Barking");
		System.out.println(name1);
	}
}
public class Animal_practice {

	public static void main(String[] args) {
		Dog max=new Dog();
		max.eat();
		max.sound();
	}

}