package Interface_practice;
interface Shape 
{
	void draw();
}
class Circle implements Shape 
{
	public void draw() 
	{ 
		System.out.println("Circle");
	}
}
class Square implements Shape 
{
	public void draw() 
	{
		System.out.println("square");
	}
}
public class Shape_program {

	public static void main(String[] args) {
		Shape circle=new Circle();
		circle.draw();
		Shape square = new Square();
		square.draw();
	}
}