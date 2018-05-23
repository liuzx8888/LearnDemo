package filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
	public static void main(String[] args) throws IOException {
		String strpath ="D:"+File.separator+"JavaTest"+File.separator+"test.txt"; 	
		File f = new File(strpath);
		Writer writer = new FileWriter(f);
		writer.write(strpath);
		//writer.flush();
		writer.close();
	}

}
