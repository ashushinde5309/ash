package module3;
import java.util.*;
public class Ifdemo5 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int n;
		int a;
		int b;
		int c;
		System.out.println("Enter number ");
		n=obj.nextInt();
		if(n>9)
		{
			a=n%10;
			b=n/10;
			c=(int) Math.pow(b, a);
			System.out.println(c);
		}
	}
}
