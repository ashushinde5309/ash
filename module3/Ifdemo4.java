package module3;
import java.util.*;
public class Ifdemo4 {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int n,a;
		System.out.println("Enter number ");
		n=obj.nextInt();
		if(n>=0 && n<=9)
		{
			System.out.println("Number is one digit number ");
		}	
		else if(n>=10 && n<=99)
		{
			System.out.println("Number is two digit number ");
		}	
		else if(n>=100 && n<=999)
		{
			System.out.println("Number is three digit number ");
		}
		else if(n>=1000 && n<=9999)
		{
			System.out.println("Number is four digit number ");
		}
	}

}
