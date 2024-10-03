package module6;
import java.util.*;
public class StudentConstructor {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
//		StudentConst student=new StudentConst();
//		student.display();
//		student.markatten();
//		System.out.println("=============================");
//		
//		StudentConst student1=new StudentConst(10,"G",55);
//		student1.display();
//		student1.markatten();
//	    System.out.println("===============================");
	    
	    System.out.println("Enter roll no, name & score");
	    int Roll_no=obj.nextInt();
	    String name=obj.next();
	    double score=obj.nextDouble();
	    
	    StudentConst student2=new StudentConst();
//	    StudentConst student2=new StudentConst(Roll_no, name, score);
	    student2.setRoll_no(Roll_no);
	    student2.setName(name);
	    student2.setScore(score);
//	    student2.display();
//		student2.markatten();
	    System.out.println("Displaying Details............");
	    System.out.println("Roll no is "+student2.getRoll_no());
	    System.out.println("Name is "+student2.getName());
	    System.out.println("Score is "+student2.getScore());
	    student2.markatten();
	    System.out.println("============================");
	    System.out.println("Enter new name= ");
	    String name2=obj.next();
	    student2.setName(name2);
	    System.out.println("New name is "+student2.getName());
	    
	}

}
