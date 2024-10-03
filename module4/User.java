package module4;
import java.util.Scanner;
public class User 
{
	String name;
	int age;
	double sal;
	Scanner ob=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter name age & salary");
		name=ob.next();
		age=ob.nextInt();
		sal=ob.nextInt();
		
	}
	public void display()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Salary "+sal);
		
	}
	public void cheakage()
	{
		if(age>18)
		{
			System.out.println("you are eligible for vote");
		}
		else if(age>18 && age<100)
		{
			System.out.println("Age is valid");
		}
		else 
		{
			System.out.println("Age is invalid");
		}
	}
		public void cheaksal()
		{
			if(sal>0 && sal<=100000)
			{
				System.out.println("Salaray is valid");
			}
			else
			{
				System.out.println("Salary is invalid");
			}
			
		}
	

	

}
