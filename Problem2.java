package vandana_madam_day2;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("Enter size of array= ");
		n=obj.nextInt();
		int a[]=new int[n];
		try
		{
			System.out.println("Enter"+n+" numbers");
			for(int i=0;i<n;i++)
			{
				a[i]=obj.nextInt();
			}
			int b;
			System.out.println("Enter value you want to access");
			b=obj.nextInt();
			System.out.println(a[b]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
//			System.out.println("Enter valid number as input ");
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
