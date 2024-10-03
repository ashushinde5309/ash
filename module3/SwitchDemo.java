package module3;
import java.util.*;
public class SwitchDemo 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("Enter number");
		n=obj.nextInt();
		switch(n)
		{
			case 5:
				System.out.println("Hello");
				break;
			case 4:
				System.out.println("Ashu");
				break;
			case 3:
				System.out.println("Shinde");
				break;
		    default:
		    	System.out.println("Switch case demo over");
		}

	}

}
