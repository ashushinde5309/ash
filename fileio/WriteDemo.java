package fileio;
import java.io.*;
public class WriteDemo {

	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("D:\\ASHU JAVA PRG\\ASHU\\myfile.txt");
		FileOutputStream out=new FileOutputStream("D:\\ASHU JAVA PRG\\ASHU\\newfile.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			out.write(i);
		}

	}

}
