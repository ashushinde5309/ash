package patterns;

public class Pattern16 {

	public static void main(String[] args) {
		int sp=1;
		int st=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<st;k++)
			{
				System.out.print((i+k+1)+" ");
			}
			sp++;
			st--;
			System.out.println(" ");
		}

	}

}
