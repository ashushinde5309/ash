package assignment081024;
import java.util.ArrayList;
import java.util.Iterator;
class Account1
{
	private int accNo;
	private String name;
	private double balance;
	public Account1(int accNo, String name, double balance) {
	
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account1 [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
public class Account {

	public static void main(String[] args) 
	{
		ArrayList arrayList=new ArrayList();
		Account1 obj=new Account1(01, "Ashutosh", 10000);
		Account1 obj2=new Account1(01, "Rushi", 1000);
		Account1 obj3=new Account1(01, "Sujit", 5000);
		Account1 obj4=new Account1(01, "Panesh", 2000);
		Account1 obj5=new Account1(01, "Jayesh", 3000);
		Account1 obj6=new Account1(01, "Rohit", 7000);
		
		
		arrayList.add(obj);
		arrayList.add(obj2);
		arrayList.add(obj3);
		arrayList.add(obj4);
		arrayList.add(obj5);
		arrayList.add(obj6);
		
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
		System.out.println("By iteration Method");
		Iterator itr=arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
