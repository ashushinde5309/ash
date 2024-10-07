package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheakedExceptionDemo {

	public static void main(String[] args)  {
		try {
		FileInputStream fis=new FileInputStream("D:\\ASHU JAVA PRG\\ASHU\\myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.print((char)k);
		}
		fis.close();
		}
		catch(IOException e)
		{
			System.out.println("Wrong path");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

}
