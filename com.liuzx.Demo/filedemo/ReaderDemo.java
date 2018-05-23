package filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderDemo {
	
	public static void main(String[] args) throws IOException {
		String strpath ="D:"+File.separator+"JavaTest"+File.separator+"test.txt"; 	
		File f = new File(strpath);
		Reader reader  = new FileReader(strpath);
		Reader reader1 = new InputStreamReader(new FileInputStream(f));
		
		
		char[] b = new char[(int) f.length()];
		reader.read(b);

		char[] b1 = new char[(int) f.length()];
		reader1.read(b1);		
		System.out.println(b1);
		reader.close();	
		reader1.close();
	}

}
