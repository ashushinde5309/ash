package module3;
import java.util.*;
public class Ifdemo2
{

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter number 1");
		n1=obj.nextInt();
		System.out.println("Enter number 2");
		n2=obj.nextInt();
		if(n1>n2)
		{
			System.out.println("Number 1 is greater");
		}
		else if(n1<n2)
		{
			System.out.println("Number 2 is greater");
		}
		else
		{
			System.out.println("Numbers are equal");
		}
			
	}

}
