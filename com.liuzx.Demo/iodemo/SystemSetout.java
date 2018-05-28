package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class SystemSetout {
	public static void main(String[] args) {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f1 = new File(path);
		OutputStream stream = null;
		try {
			stream = new FileOutputStream(f1);
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintStream printStream = new PrintStream(stream);
		System.setOut(printStream);
		System.out.println("Hello Print SetOut");

	}

}
