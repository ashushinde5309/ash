package fileio;

import java.io.*;

public class CheakedExceptionDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\ASHU JAVA PRG\\ASHU\\myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.print((char)k);
		}
		fis.close();
		}

	}


