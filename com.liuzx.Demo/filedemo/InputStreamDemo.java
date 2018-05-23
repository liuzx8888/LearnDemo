package filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		String strpath = "D:" + File.separator + "JavaTest" + File.separator + "test.txt";
		File f = new File(strpath);
		InputStream inputStream = new FileInputStream(f);
		byte[] b = new byte[(int) f.length()];
		char[] bb = new char[(int) f.length()];
		inputStream.read(b);
		inputStream.close();

	}

}
