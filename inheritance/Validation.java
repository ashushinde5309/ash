package inheritance;
import java.util.*;
public class Validation {
	public void cheakemailvalid(String email)
	{
		int a=email.indexOf('@');
		int b=email.lastIndexOf('.');
		if(a>-1 && b>-1 && a<b)
		{
			System.out.println("Valid Email ID");
		}
		else
		{
			System.out.println("Invalid Email ID");
		}
	
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Validation cheak=new Validation();
		System.out.println("Enter Mail ID= ");
		String email=sc.next();
		cheak.cheakemailvalid(email);

	}

}
