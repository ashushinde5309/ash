package patterns;

public class Pattern5
{

	public static void main(String[] args) 
	{
		char c='A';
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print((char)(c+i+j)+" ");
			}
			System.out.println(" ");
		}

	}

}
