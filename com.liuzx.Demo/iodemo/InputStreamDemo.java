package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamDemo {
	public static void main(String[] args) {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f = new File(path);
		byte[] b = new byte[(int) f.length()];
		try {
			InputStream input = new FileInputStream(f);
			input.read(b);
			System.out.println("b:" + new String(b));
			char[] c = new char[(int) f.length()];
			/*
			 * 字节流 转换成字符流输入
			 */
			InputStream input1 = new FileInputStream(f);
			Reader reader = new FileReader(f);
			InputStreamReader inputStreamReader = new InputStreamReader(input1);
			inputStreamReader.read(c);
			inputStreamReader.close();
			System.out.println("c:" + new String(c));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
