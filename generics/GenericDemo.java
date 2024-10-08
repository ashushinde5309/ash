package generics;
class MyClass
{
	public <E> void printarray(E[] arr1)
	{
		for(E i:arr1)           // E=datatype of array
		{
			System.out.println(i);
		}
		System.out.println("========================");
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		MyClass myclass=new MyClass();
		Integer[] obj= {10,20,30,40,50,60};
		myclass.printarray(obj);
		Double[] obj2= {10.33,20.44,30.55,40.66,50.77,60.88};
		myclass.printarray(obj2);
		Float[] obj3= {10.33f,20.22f,30.55f,40.88f,50.42f,60.12f};
		myclass.printarray(obj3);
		String[] obj4= {"ash","ashu","uea","kjs"};
		myclass.printarray(obj4);
		
	}

}
