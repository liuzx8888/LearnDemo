package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class SystemSetErr {
	public static void main(String[] args) {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f = new File(path);

		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintStream printStream = new PrintStream(outputStream);
		System.setErr(printStream);

		try {
			System.out.println(Integer.parseInt(path));
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}

	}

}
