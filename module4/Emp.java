package module4;
import java.util.*;
public class Emp
{
	private int empNo;
	private String ename;
	private double bal;
	Scanner ec=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter employee id= ");
		empNo=ec.nextInt();
		System.out.println("Enter employee Name= ");
		ename=ec.next();
		System.out.println("Enter employee balance= ");
		bal=ec.nextDouble();
		
	}
	public void display()
	{
		System.out.println("Employee id= "+empNo);
		System.out.println("Employee name= "+ename);
		System.out.println("Employee balance= "+bal);
	}
	public void cheakEmpNo()
	{
		if(empNo>0 && empNo<50)
		{
			System.out.println("Employee no is valid");
		}
		else
		{
			System.out.println("Invalid Employee ID");
		}
	}
	public void cheakbal()
	{
		if(bal>=0 && bal<=100000)
		{
			System.out.println("valid balance");
		}
		else
		{
			System.out.println("balance is Invalid");
		}
	}
}
