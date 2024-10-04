package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheakedExceptionDemo {

	public static void main(String[] args) throws IOException {
		try {
		FileInputStream fis=new FileInputStream("D:\\ASHU JAVA PRG\\ASHU\\myfile0.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.print((char)k);
		}
		fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error");
		}
	}

}
