package module6;

public class StudentConst {
	private int roll_no;
	private String name;
	private double score;
	public StudentConst() 
	{
		System.out.println("this is default constructor");
		roll_no=0;
		name="";
		score=0.0;
	}
	public StudentConst(int roll_no,String name,double score )
	{
		super();//super() calls the parent class constructor
		System.out.println("this is parameterised constructor");
		this.roll_no=roll_no;
		this.name=name;
		this.score=score;
		
	}
	public void display()
	{
		System.out.println("Roll no= "+roll_no);
		System.out.println("Name= "+name);
		System.out.println("Score= "+score);
	}
	public void markatten()
	{
		System.out.println("Attendance Marked");
	}
	public int getRoll_no()
	{
		return roll_no;
	}
	public void setRoll_no(int roll_no) 
	{
		this.roll_no = roll_no;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() 
	{
		return score;
	}
	public void setScore(double score)
	{
		this.score = score;
	}
	

}
