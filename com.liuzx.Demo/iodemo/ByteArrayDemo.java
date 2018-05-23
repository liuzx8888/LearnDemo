package iodemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ByteArrayDemo {
	public static void main(String[] args) {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f1 = new File(path);
		byte[] b = new byte[(int) f1.length()];
		ByteArrayInputStream inputStream = new ByteArrayInputStream(path.getBytes());/* 写入内存 */
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		/*
		 * 读取内存内容方法1 try { inputStream.read(b); outputStream.write(b);
		 * System.out.println(outputStream.toString()); inputStream.close();
		 * outputStream.close(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		/*
		 * 文件的 IN OUT 是以内存为参照对象来实现的，文件流是由 内存 ---》文件的 所以对文件的写入是用 outputStream 输出是获取
		 * InputStream 写入内存则跟文件相反 读入内存是 in 获取内存数据 则用 OUT
		 */
		int temp;
		while ((temp = inputStream.read()) != -1) {

			outputStream.write(temp);

		}

		System.out.println(outputStream.toString());
		try {
			inputStream.close();
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
