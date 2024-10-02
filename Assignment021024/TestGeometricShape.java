package Assignment021024;
abstract class GeometricShape
{
	abstract public void area();
	abstract public void perimeter();
	
}
class Cicle extends GeometricShape
{
	public void area(double rad)
	{
		System.out.println("Area of circle= "+(3.14*rad*rad)); 
	}
	public void perimeter(double rad)
	{
		System.out.println("Perimeter of circle= "+(2*3.14*rad));
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}
	
	}
class Rectangle extends GeometricShape
{
	public void area(double len,double bre)
	{
		System.out.println("Area of rectangle= "+(len*bre)); 
	}
	public void perimeter(double len,double bre)
	{
		System.out.println("Perimeter of Rectangle= "+(2*(len+bre)));
	}
	
	}
class Triangle extends GeometricShape 
{
	public void area(double base,double height)
	{
		System.out.println("Area of triangle= "+(base*height)); 
	}
	public void perimeter(double rad)
	{
		System.out.println("Perimeter of tri= "+(2*3.14*rad));
	}
	
	}

public class TestGeometricShape 
{

	public static void main(String[] args) 
	{
		

	}

}
