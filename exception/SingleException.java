package exception;
import java.util.*;
public class SingleException
{
	public static double divide(int n1,int n2)
	{
		return n1/n2;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		try{
			System.out.println("Enter 2 numbers ");
			int n1=obj.nextInt();
			int n2=obj.nextInt();
			double result=divide(n1,n2);
			System.out.println("Result is "+result);
		}
		catch(ArithmeticException e)
		{
//			System.out.println("we cannot divide any number by zero ");
//			System.out.println(e);
			e.printStackTrace();
//			
//			System.out.println(e.getMessage());
		}
		
		

	}

}
