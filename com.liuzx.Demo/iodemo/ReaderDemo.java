package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
	public static void main(String[] args) {

		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f1 = new File(path);
		try {
			Reader reader = new FileReader(f1);
			int temp;
			while ((temp = reader.read()) != -1) {
				System.out.println((char) temp);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
