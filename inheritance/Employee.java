package inheritance;

public class Employee extends Student
{
	private int eno;
	private String field;
	private double sal;
	public Employee(String name, int age, String gender, int rollNo, String stream, double score, int eno, String field,
			double sal) {
		super(name, age, gender, rollNo, stream, score);
		this.eno = eno;
		this.field = field;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", field=" + field + ", sal=" + sal + ", rollNo=" + rollNo + ", stream="
				+ stream + ", score=" + score + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	







	
	

}
