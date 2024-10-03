package module7;

public class BankAccount {
	private int accNo;
	private double balance;
	private static int idnum=1;
	public BankAccount()
	{
		accNo=idnum++;
		balance=0;
	}
	public BankAccount(int balance) {
		
		this.accNo = idnum++;
		this.balance = balance;
	}
	public static int getIdnum()
	{
		return idnum;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}
	public static void main(String args[])
	{
		BankAccount bankaccount=new BankAccount();
		System.out.println(bankaccount.getIdnum()); 
		BankAccount bankaccount2=new BankAccount();
		System.out.println(bankaccount2);
		BankAccount bankaccount3=new BankAccount(6000);
		System.out.println(bankaccount3);
	}
	
}
