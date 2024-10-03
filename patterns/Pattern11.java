package patterns;

public class Pattern11 {

	public static void main(String[] args) 
	{
		int sp=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			sp--;
			System.out.println(" ");
		}

	}

}
