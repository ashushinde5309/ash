package module5;

public class StaticMethodDemo {
	static public int add(int a,int b)
	{
		return (a+b);
	}
	static public int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	static public double add(int a,double b)
	{
		return (a+b);
	}

	public static void main(String[] args) 
	{
		int res=add(10,20);
		System.out.println(res);
		int res2=add(10,45);
		System.out.println(res2);
		double res3=add(40,10.15);
		System.out.println(res3);
		

	}

}
