package abstractpac;
abstract class Animal{
	final int legs=4;
	abstract public void sound();
	abstract public void fun1();
	abstract public void fun2();
	public void classinfo(String type)
	{
		System.out.println("I belong to "+type+" has "+legs+" legs.");
	}
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Barks");
	}
	public void fun1()
	{
		System.out.println("Fun1");
	}
	public void fun2()
	{
		System.out.println("Fun2");
	}
}
class Lion extends Animal
{
	public void sound()
	{
		System.out.println("Roars");
	}
	public void fun1()
	{
		System.out.println("lion Fun1");
	}
	public void fun2()
	{
		System.out.println("lion Fun2");
	}
}
public class TestAnimal {

	public static void main(String[] args) {
		Dog tuffy=new Dog();
		tuffy.classinfo("Dog");
		tuffy.sound();
		tuffy.fun1();
		tuffy.fun2();
		System.out.println("=========================");
		Lion sher=new Lion();
		sher.classinfo("Sher");
		sher.sound();
		sher.fun1();
		sher.fun2();
	}

}
