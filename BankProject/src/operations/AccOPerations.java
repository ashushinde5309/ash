package operations;

import entity.Account;

public class AccOPerations 
{
	public boolean withdrawal(Account account,double amount)
	{
		double bal=account.getBalance();
		if(bal<amount)
		{
			System.out.println("Insufficient Balance...");
			return false;
		}
		else if(amount<=0)
		{
			System.out.println("Withdrawal Amount cannot be negative and Zero..");
			return false;
		}
		else
		{
			bal=bal-amount;
			account.setBalance(bal);
			System.out.println("Amount withdrawal Successfully");
			return true;
		}
	}
	
	public boolean deposit(Account account,double amount)
	{
		double  bal=account.getBalance();
		if(amount<=0)
		{
			System.out.println("Deposit Amount cannot be negative and zero");
			return false;
		}
		else if(amount>49000)
		{
			System.out.println("PAN Card Number is required for Deposits more than 49000");
			return false;
		}
		else 
		{
			bal=bal+amount;
			account.setBalance(bal);
			return true;
	    }
	
	}
	public boolean transfer(Account account1,Account account2,double amount)
	{
		double bal1=account1.getBalance();
		double bal2=account2.getBalance();
		if(amount<0)
		{
			System.out.println("Amount cannot be negative..");
			return false;
		}
		else if(bal1<amount)
		{
			System.out.println("Insufficient balance ");
			return false;
		}
		else
		{
			bal1=bal1-amount;
			bal2=bal2+amount;
			account1.setBalance(bal1);
			account2.setBalance(bal2);
			return true;
		}
	}
	
}

