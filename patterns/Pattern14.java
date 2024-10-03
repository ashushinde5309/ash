package patterns;

public class Pattern14 {

	public static void main(String[] args) 
	{
		int a=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(a+" ");
			}
			a--;
			System.out.println(" ");
		}

	}

}
