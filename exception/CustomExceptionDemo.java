package exception;
import java.util.*;
class CheakPassward extends Exception
{
	public CheakPassward(String msg)
	{
		super(msg);
	}
	
}

public class CustomExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter passward");
		String passward=obj.next();
		try 
		{
			if(passward.length()<8) 
			{
				throw new CheakPassward("Passward length shouls be 8");
			}
		     else if(passward.matches("([A-Za-z0-9]*)"))
		    	 
			{
				throw new CheakPassward("Passward should have special characters");
			}
			else
			{
				System.out.println("Valid passward");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
