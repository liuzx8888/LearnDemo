package iodemo;

import java.io.IOException;
import java.io.PrintStream;

public class SystemOutDemo {
	public static void main(String[] args) {
		PrintStream printStream = System.out;
		String str1 = "Hello World";
		try {
			printStream.write(str1.getBytes());
			printStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
