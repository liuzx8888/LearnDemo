package iodemo;

import java.io.IOException;
import java.io.InputStream;

public class SystemInDemo {
	public static void main(String[] args) {
		InputStream printStream = System.in;
		StringBuffer buffer = new StringBuffer();

		try {
			int temp = 0;
			while ((temp = printStream.read()) != -1) {
				if ((char) temp == '\n') {
					break;
				}
				buffer.append((char) temp);
			}

			printStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("输入的内容为:" + buffer);

	}

}
