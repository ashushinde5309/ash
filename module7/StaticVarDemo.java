package module7;

public class StaticVarDemo 
{
	static int n=1;
	public void display()
	{
		n++;
		System.out.println(n);
	}

	public static void main(String[] args) 
	{
		System.out.println(n);
		System.out.println(StaticVarDemo.n);

	}

}
