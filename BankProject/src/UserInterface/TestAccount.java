package UserInterface;
import java.util.*;
import entity.Account;
import operations.AccOPerations;
public class TestAccount 
{
	
		public static void main(String[] args) 
		{
			Account account1=new Account(1,"Ashu",5000000);
			Account account2=new Account(2,"Ashutosh",10000000);
			AccOPerations accoperations=new AccOPerations();
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
			    	System.out.println("Enter AC no");
			    	int ac=obj.nextInt();
			    	if(ac==1)
			    	{
			    	System.out.println("Account no is "+account1.getAccNo());
			    	System.out.println("Account Name is "+account1.getAccHoldName());
			    	System.out.println("Account balance is "+account1.getBalance());
			    	}
			    	else if(ac==2)
			    	{
			    		System.out.println("Account no is "+account2.getAccNo());
				    	System.out.println("Account Name is "+account2.getAccHoldName());
				    	System.out.println("Account balance is "+account2.getBalance());
			    	}
			    	else
			    	{
			    		System.out.println("Please Enter Valid AC no ");
			    	}

			    	
			    	break;
			    case 3:
			    	System.out.println("Enter amount for Withdrawal ");
			    	double amount=obj.nextDouble();
			    	boolean result=accoperations.withdrawal(account1, amount);
			    	if(result==true)
			    	{
			    		System.out.println("Amount Withdrawal successfully");
			    		System.out.println("Updated balance is "+account1.getBalance());
			    	}
			    	else
			    	{
			    		System.out.println("Withdrawal Failed");
			    		
			    	}
			    	break;
			    case 4:
			    	System.out.println("Enter amount for Deposit ");
			    	amount=obj.nextDouble();
			    	result=accoperations.deposit(account1, amount);
			    	if(result==true)
			    	{
			    		System.out.println("Amount Deposited successfully");
			    		System.out.println("Updated balance is "+account1.getBalance());
			    	}
			    	else
			    	{
			    		System.out.println("Deposit Failed");
			    		
			    	}
			    	
			    	break;
			    case 5:
			    	System.out.println("Enter amount to be transfer");
			    	amount=obj.nextDouble();
			    	System.out.println("Current balance of Debited Account is "+account1.getBalance());
		    		System.out.println("Current balance of Credited Account is "+account2.getBalance());
		    		System.out.println("==================================================");
			    	result=accoperations.transfer(account1, account2, amount);
			    	if(result==true)
			    	{
			    		System.out.println("Amount transferred Successfully");
			    		System.out.println("Updated balance of Debited Account is "+account1.getBalance());
			    		System.out.println("Updated balance of Credited Account is "+account2.getBalance());

			    	}
			    	break;
			    case 6:
			    	System.out.println("Enter AC no");
			    	ac=obj.nextInt();
			    	if(ac==1)
			    	{
			    	System.out.println("Balance in your Account is "+account1.getBalance());
			    	}
			    	else if(ac==2)
			    	{
				    	System.out.println("Balance in your Account is "+account2.getBalance());

			    	}
			    	else
			    	{
			    		System.out.println("Please Enter Valid AC no ");
			    	}
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


