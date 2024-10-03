package module3;
import java.util.*;
public class Ifdemo 
{

	public static void main(String[] args) 
	{
		Scanner ec=new Scanner(System.in);
		int num;
		System.out.println("Enter number ");
		num=ec.nextInt();
		if(num>0)
		{
			System.out.println("Number is Positive");
			
		}
		else if(num==0)
		{
			System.out.println("Number is zero ");
		}
		else
		{
			System.out.println("Number is Negative");
		}
		}
}


