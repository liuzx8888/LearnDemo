package iodemo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException {
		Reader reader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String str = null;
		
		System.out.println("请输入内容：");
		try {
			str = bufferedReader.readLine();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("输入的内容：" + str);
		bufferedReader.close();

	}

}
