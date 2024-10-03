package module5;

public class Circle 
{

	public static void main(String[] args) 
	{
		Circle_ cir=new Circle_();
		cir.accept();
		cir.calarea();
		cir.calperi();
		cir.display();
		Circle_ cir2=new Circle_();
		Circle_ cir3=new Circle_();
		System.out.println(cir.hashCode());
		System.out.println(cir2.hashCode());
		System.out.println(cir3.hashCode());
		boolean result=cir.equals(cir2);
		System.out.println(result);
		

	}

}
