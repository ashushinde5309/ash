package StaticNested;
class OuterClass
{
	private static String msg=" Welcome Nested Class";
	
	public static class NestedStaticClass{
		public void printMsg()
		{
			System.out.println("Msg from nested Static class"+msg);
		}
	}
	public class InnerClass
	{
		public void display()
		{
			System.out.println("Msg from non-static nested class"+msg);
			
		}
		
	}
	}

public class ClassesNested 
{

	public static void main(String[] args) 
	 {
		OuterClass.NestedStaticClass printer=new OuterClass.NestedStaticClass();
		printer.printMsg();
		OuterClass outer=new OuterClass();
		OuterClass.InnerClass inner=outer.new InnerClass();
		inner.display();

	}

}
