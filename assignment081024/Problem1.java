package assignment081024;

class Prime implements Runnable
{
	public synchronized void fprime()
	{	int i;
		for(i=2;i<24;i++)
		{	int t=i;
			if(i%t==0 && i%1==0)
			{ 
				System.out.println("prime numbers are "+i);
			}
		}
	}
	public void run()
	{
		fprime();
	}
	
	
	
}
public class Problem1 {
	
	public static void main(String[] args) 
	{
		Prime obj=new Prime();
		Thread thread=new Thread(obj);
		thread.start();
		

	}

}
