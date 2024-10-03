package module3;

public class OrDemo {

	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		int c=300;
		if(a==b)
		{
			System.out.println("Same");
		}
		if(a>b || a>c)
		{
			System.out.println("Any one of the condition is true");
		}
		if(a!=b)
		{
			System.out.println("Both are different");
		}

	}

}
