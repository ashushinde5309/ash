package abstractpac;
class Address
{
	String city;
	String state;
	String country;
	

public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
class Emp
{
	int id;
	String name;
	Address address;
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void display()
	{
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
		System.out.println("City is "+address.city+" State is "+address.state+" Country is "+address.country);
	}
	
}

public class TestEmp {

	public static void main(String[] args) {
		Address add1=new Address("Nashik", "Maharashtra", "India");
		Address add2=new Address("Pune", "Maharashtra", "India");
		
		Emp emp1=new Emp(01, "Ashu", add1);
		Emp emp2=new Emp(01, "Ashutosh", add2);
		emp1.display();
		System.out.println("======================================");
		emp2.display();	}

}
