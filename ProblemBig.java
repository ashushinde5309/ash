package vandana_madam_day2;
import java.util.*;
class Calculator
{
	int x;
	int y;
	public Calculator(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void Add()
	{
		try 
		{
		if(x>=0 && y>=0) {
		System.out.println("Addition is "+(x+y));}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please Enter Positive number input");
		}
	}
	public void Substract()
	{
		try 
		{
		if(x>=0 && y>=0) {
		System.out.println("Substraction is "+(x-y));}
		}

		catch(ArithmeticException e)
		{
			System.out.println("Please enter positive number input");
		}
	}
	
	public void Multiply()
	{
		try
		{
			if(x>0 && y>0)
			{
			System.out.println("Multiplication is "+(x*y));
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter number Greater yhan 0");
		}
		
	}
	public void Division()
	{
		try
		{
		System.out.println("Division is "+(x/y));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter number Greater yhan 0");
		}
	}
	
}

public class ProblemBig 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			int a;
			System.out.println("Enter value of A= ");
			a=sc.nextInt();
			int b;
			System.out.println("Enter value of B= ");
			b=sc.nextInt();
			Calculator obj=new Calculator(a,b);
			obj.Add();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Wrong Input");
		}
		try
		{
			int a;
			System.out.println("Enter value of A= ");
			a=sc.nextInt();
			int b;
			System.out.println("Enter value of B= ");
			b=sc.nextInt();
			Calculator obj2=new Calculator(a,b);
			obj2.Substract();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Wrong Input");
		}
		try
		{
			int a;
			System.out.println("Enter value of A= ");
			a=sc.nextInt();
			int b;
			System.out.println("Enter value of B= ");
			b=sc.nextInt();
			Calculator obj3=new Calculator(a,b);
			obj3.Multiply();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Wrong Input");
		}
		try
		{
			int a;
			System.out.println("Enter value of A= ");
			a=sc.nextInt();
			int b;
			System.out.println("Enter value of B= ");
			b=sc.nextInt();
			Calculator obj4=new Calculator(a,b);
			obj4.Division();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Wrong Input");
		}

	}

}
