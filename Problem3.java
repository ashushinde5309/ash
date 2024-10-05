package exception;
import java.util.*;
//import java.util.NoSuchElementException;
//import java.util.StringTokenizer;

public class Problem3 {

	public static void main(String[] args) {
		StringTokenizer obj=new StringTokenizer("Hello World");
		try
		{
		String firsttoken=obj.nextToken();
		System.out.println("First Token= "+firsttoken);
		String secondtoken=obj.nextToken();
		System.out.println("Second Token= "+secondtoken);
		String thirdtoken=obj.nextToken();
		System.out.println("Third Token= "+thirdtoken);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Please give valid input");
			System.out.println(e);
		}
	}

}
