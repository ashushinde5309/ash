package inheritance;

public class TestTrans {

	public static void main(String[] args) 
	{
		Transportation trans=new Transportation(10, 300, 10);
		System.out.println(trans);
		trans.display();
		System.out.println("============================");
		Transportation trans2=new ByWater(10, 300, 10, 20, 2);
		System.out.println(trans2);
		System.out.println("============================");
		trans2=new ByAir(10, 300, 10, 20, 2, 15, 300);
		System.out.println(trans2);
		System.out.println("============================");
		trans2=new ByRoad(10, 300, 10, 20, 2, 15, 300, 11, 5);
		System.out.println(trans2);
		System.out.println("============================");
		

	}

}
