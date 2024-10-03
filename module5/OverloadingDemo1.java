package module5;
//with obj
public class OverloadingDemo1 
{
	public void main()
	{
		System.out.println("main with no parameter");
	}
	public void main(int a,int b)
	{
		System.out.println("main with 2 parameter");
	}
	public void main(int a)
	{
		System.out.println("main with 1 parameter");
	}

	public static void main(String[] args) {
		OverloadingDemo1 obj=new OverloadingDemo1();
		obj.main();
		obj.main(10, 20);
		obj.main(20);

	}

}
