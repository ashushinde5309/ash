package vandana_madam_day2;
import java.util.*;
public class problem1 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int s;
		try 
		{
			System.out.println("Enter number= ");
			s=obj.nextInt();
			System.out.println(s*s);
		}
		catch(InputMismatchException e)
		{
//			System.out.println("please enter a number not characters");
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
