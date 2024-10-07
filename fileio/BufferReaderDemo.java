package fileio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException{
		File file=new File("D:\\ASHU JAVA PRG\\ASHU\\myfile.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr,300);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}

		
	}

}
