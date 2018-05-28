package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * scanner.useDelimiter("\n"); String str = scanner.next();
		 * System.out.println(str);
		 */

		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f = new File(path);
		StringBuffer buffer = new StringBuffer();
		String str1 = null;
		Scanner scanner1;
		try {
			scanner1 = new Scanner(f);

			while (scanner1.hasNext()) {
				str1 = buffer.append(scanner1.next()).toString();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str1);
	}

}
