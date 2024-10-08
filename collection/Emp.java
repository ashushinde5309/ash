package collection;

public class Emp {
	private int empno;
	private String name;
	private double salary;
	public Emp()
	{
		
	}
	public Emp(int empno,String name,double salary)
	{
		this.empno=empno;
		this.name=name;
		this.salary=salary;
	}
//	public int getEmpno(int empno)
//	{
//		return empno;
//	}
//	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
		
}
