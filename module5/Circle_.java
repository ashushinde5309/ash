package module5;
import java.util.*;
public class Circle_
{
	private double radius;
	private double area1;
	private double peri;
	static double PI=3.14;
	static double TAX=18;
	Scanner sc=new Scanner(System.in);
	static {
		PI=3.14;
		TAX=18;
		
	}
	void accept()
	{
		System.out.println("Enter Circle radius");
		radius=sc.nextDouble();
		
	}
	void calarea()
	{
		area1=PI*radius*radius;
	}
	void calperi()
	{
		peri=2*PI*radius;
	}
	void display()
	{
		System.out.println("Circle radius is "+radius);
		System.out.println("Circle Area is "+area1);
		System.out.println("Circle Perimeter is "+peri);
	}

}
