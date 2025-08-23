package Polymorphism_practice;
class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
	void sound()
	{
		System.out.println("Sound");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Eats=Pedigree");
	}
	void sound()
	{
		System.out.println("Sound=Bark");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Eats=Meat");
	}
	void sound()
	{
		System.out.println("Sound=Roar");
	}
}
public class Animal_p {

	public static void main(String[] args) {
		System.out.println("******Dog******");
		Dog max=new Dog();
		max.eat();
		max.sound();
		
		System.out.println("******Tiger******");
		Tiger sher=new Tiger();
		sher.eat();
		sher.sound();
	}

}
