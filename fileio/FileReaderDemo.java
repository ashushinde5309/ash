package fileio;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
			FileReader fr=new FileReader("D:\\ASHU JAVA PRG\\ASHU\\myfile.txt");
			int i;
			while((i=fr.read())!= -1)
			{
				System.out.print((char)i);
			}
			fr.close();

	}

}
