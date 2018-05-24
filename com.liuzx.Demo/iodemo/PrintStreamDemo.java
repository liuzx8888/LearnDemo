package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		PrintStream printStream = null;
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File file = new File(path);
		try {
			printStream = new PrintStream(new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		printStream.println("PrintStream Demo");
		printStream.println(1 + 2);
		printStream.close();

	}

}
