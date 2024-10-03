package module7;
class Shape
{
	void calArea(String shape,int a,int b)
	{
		System.out.println("Cal Area of shape class= "+a*b);
	}
	void display()
	{
		System.out.println("Display of shape class");
	}
	void fun1()
	{
		System.out.println("Fun1 of Shape class");
	}
	
}
class Rectangle extends Shape
{
	void calArea(String shape,int a,int b)
	{
		System.out.println("Cal Area of shape class ");
		
	}
	void display()
	{
		super.display();
		super.fun1();
		System.out.println("Display of Rectangle class");
		
	}
}

public class FunctionOverriding 
{

	public static void main(String[] args) 
	{
		Shape shape=new Shape();
		shape.calArea("Shape", 10, 20);
		shape.display();
		System.out.println("====================================");
		Rectangle rectangle=new Rectangle();
		rectangle.calArea("Rectangle", 30, 40);
		rectangle.display();
		System.out.println("====================================");
		shape=new Rectangle();
		shape.calArea("Rect", 20, 140);
		shape.display();

	}

}
