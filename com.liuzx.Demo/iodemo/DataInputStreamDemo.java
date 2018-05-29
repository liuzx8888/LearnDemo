package iodemo;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f = new File(path);
		InputStream in = new FileInputStream(f);
		DataInputStream dataInputStream = new DataInputStream(in);
		byte b[] = new byte[1024];
		dataInputStream.read(b);
		System.out.println(new String(b, "utf-8"));
		dataInputStream.close();

	}

}
