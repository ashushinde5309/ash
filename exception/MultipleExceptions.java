package exception;
import java.util.*;
public class MultipleExceptions {
	public static double divide(int n1,int n2)
	{
		return n1/n2;
	}
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		String str="100"; 
		String str2="00";
		
		try{
			int n1=Integer.parseInt(str);
			int n2=Integer.parseInt(str2);
			double result=divide(n1,n2);
			System.out.println("Result is "+result);}
		catch(ArithmeticException e)
		{
			System.out.println("Number cannot be divide by zero");
		}
		catch(NumberFormatException e2)
		{
			System.out.println("The value Expected is number not string");
		}
		catch(Exception e)
		{
			System.out.println("Error:There is an error ");
		}
		finally
		{
			System.out.println("Finally block Executed");
		}
	}

}
