package entity;

public class Account {
	private int accNo;
	private String accHoldName;
	private double balance;
	public Account()
	{
		accNo=0;
		accHoldName=null;
		balance=0;
	}
	public Account(int accNo, String accHoldName, double balance) {
		
		this.accNo = accNo;
		this.accHoldName = accHoldName;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHoldName() {
		return accHoldName;
	}
	public void setAccHoldName(String accHoldName) {
		this.accHoldName = accHoldName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [Account No= " + accNo + ", Account Holder Name= " + accHoldName + ",Account balance= " + balance + "]";
	}
	
}
