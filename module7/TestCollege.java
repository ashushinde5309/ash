package module7;
class Stream
{
	private String types;
	private int fees;
	private int noOfStudents;
	public Stream(String types, int fees, int noOfStudents) {
		super();
		this.types = types;
		this.fees = fees;
		this.noOfStudents = noOfStudents;
	}
	@Override
	public String toString() {
		return "stream [types=" + types + ", fees=" + fees + ", noOfStudents=" + noOfStudents + "]";
	}
	
	}
class College
{
	private String name;
	private char grade;
	private String address;
	private String contactno;
	public College(String name, char grade, String address, String contactno) {
		super();
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "college [name=" + name + ", grade=" + grade + ", address=" + address + ", contactno=" + contactno + "]";
	}
	
	
	
	}

public class TestCollege 
{

	public static void main(String[] args) 
	{
		College college=new College("MET",'A',"NAshik","nashik@");
		Stream stream1=new Stream("Cs",70000,80);
		Stream stream2=new Stream("It",70000,80);
		Stream stream3=new Stream("Mech",70000,80);
		Stream stream4=new Stream("Ele",70000,80);
		Stream stream5=new Stream("CIvil",70000,80);
		
		System.out.println(college);
		System.out.println(stream1);
		System.out.println(stream2);
		System.out.println(stream3);
		System.out.println(stream4);
		System.out.println(stream5);
		
		

	}

}
