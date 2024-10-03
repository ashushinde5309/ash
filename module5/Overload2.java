package module5;

public class Overload2 {

	static public int main()
	{
		return 0;
	}
	static public int main(int a,int b)
	{
		return (a+b);
	}
	static public double main(double d)
	{
		return d;
	}

	public static void main(String[] args) 
	{
		int a=main();
		System.out.println(a);
		int b=main(10,20);
		System.out.println(b);
		double c=main(210.12);
		System.out.println(c);
		

	}

}
