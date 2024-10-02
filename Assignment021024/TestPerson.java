package Assignment021024;

final class Person 
{
	final String name;
	final int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String toString() 
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class TestPerson 
{

	public static void main(String[] args) 
	{
		Person person = new Person("Ashu", 26);
		person.setName("ASHUTOSH");//  for final field, value cannot be assign
		person.setAge(40);//  for final field, value cannot be assign
		person.getName();
		person.getAge();

	}

}
