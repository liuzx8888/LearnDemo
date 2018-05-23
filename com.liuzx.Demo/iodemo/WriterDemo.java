package iodemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class WriterDemo {

	public static void main(String[] args) {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f1 = new File(path);
		try {
			Writer out = new FileWriter(f1);
			out.write("Test IO writer");
			/* out.flush(); 直接从内存刷新到文件中 */
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
