package module3;
import java.util.*;
public class Ifdemo3 {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		System.out.println("Enter 3 numbers ");
		n1=obj.nextInt();
		n2=obj.nextInt();
		n3=obj.nextInt();
		if(n1>n2 && n1>n3 )
		{
			System.out.println("Number 1 is greater");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("Number 2 is greater");
		}
		else if(n3>n1 && n3>n2)
		{
			System.out.println("Number 3 is greater");
		}
		else
		{
			System.out.println("Numbers are equal");
		}
	}

}
