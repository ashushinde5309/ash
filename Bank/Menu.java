package Bank;
import java.util.*;
public class Menu 
{

	public static void main(String[] args) 
	{
		int choice;
		String ch;
		Scanner obj=new Scanner(System.in);
		do {
			System.out.println("******Bank*******");
			System.out.println("1.Accept Details ");
			System.out.println("2.Display Details");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Deposit Amount");
			System.out.println("5.Transfer Amount");
			System.out.println("6.Cheak Balance");
			System.out.println("7.Update Balance");
			System.out.println("8.Exit");
			System.out.println("Enter your Choice");
			choice=obj.nextInt();
			
		    switch(choice)
		    {
		    case 1:
		    	System.out.println("Accepting Account details");
		    	break;
		    case 2:
		    	System.out.println("Displaying Details");
		    	break;
		    case 3:
		    	System.out.println("Wthdrawal ");
		    	break;
		    case 4:
		    	System.out.println("Deposit ");
		    	break;
		    case 5:
		    	System.out.println("Transfer ");
		    	break;
		    case 6:
		    	System.out.println("Cheak ");
		    	break;
		    case 7:
		    	System.out.println("Update ");
		    	break;
		    case 8:
		    	System.out.println("Thank you for visiting us........"
		    			+ " ");
		    	System.exit(0);
		    default:
		    	System.out.println("Please Enter valid choice");
		    	break;
		    }
			System.out.println("Do you want to continue? (y/n)");
			ch=obj.next();
		}while(ch.equalsIgnoreCase("y"));
		System.out.println("Thank you for Banking with us...");
	}

}
