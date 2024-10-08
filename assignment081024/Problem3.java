package assignment081024;
import java.util.ArrayList;
class Account1
{
	private int accNo;
	private String name;
	private double balance;
	
	public Account1(int accNo, String name, double balance) {
		super();
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
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
class Emp
{
	private int empno;
	private String name;
	private double salary;
	
	public Emp(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
public class Problem3 {

	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		Account1 obj1=new Account1(01, "Ashutosh", 1000);
		Account1 obj2=new Account1(02, "Rudhi", 3000);
		
		Emp obj3=new Emp(03, "Ashutosh", 100000);
		Emp obj4=new Emp(03, "Jayesh", 10000);
		
		

	}

}
