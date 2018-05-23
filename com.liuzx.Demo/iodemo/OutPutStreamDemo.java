package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutPutStreamDemo {
	public static void main(String[] args) {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		String context = "Test Io Demo ";
		String context1 = "Test Io Demo zifu";
		File f = new File(path);
		try {
			OutputStream outputStream = new FileOutputStream(f, true);
			outputStream.write(context.getBytes());
			/*
			 * 字节流转换成字符流
			 */
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
			outputStreamWriter.write(context1);

			outputStreamWriter.close();
			outputStream.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
