package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class SystemSetIn {
	public static void main(String[] args) throws Exception {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f1 = new File(path);
		InputStream inputStream = new FileInputStream(f1);
		System.setIn(inputStream); /* 修改了 System in 的位置 */

		InputStream inputStream1 = System.in; 
		StringBuffer buffer = new StringBuffer();  /*引用类型  经常犯错！！！！*/
		int temp;
		while ((temp = inputStream1.read()) != -1) {
			buffer.append((char) temp);
		}
		System.out.println("输入的内容是" + buffer);
		inputStream1.close();

	}
}
