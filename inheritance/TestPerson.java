package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		Person person=new Person("Ashutosh",18,"male");
		System.out.println(person);
		person.display();
		person.fun1();
		System.out.println("=========================================");
		Student student=new Student("Ashu", 26, "Male", 01, "Mech", 100);
		System.out.println(student);
		student.display();
		System.out.println("==========================================");
		Person person2=new Person("uma",22,"female");
		System.out.println(person2);
		person2=new Student("Ashu", 26, "Male", 01, "Mech", 100);
		System.out.println(person2);
		person2=new Employee("Ashu", 26, "Male", 01, "Mech", 100, 001, "Tech", 100000);
		System.out.println(person2);
		
		
	}

}
