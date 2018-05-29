package iodemo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class DataOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f = new File(path);
		DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(f, true));
		String name[] = { "服装", "鞋子", " 手套" };
		float price[] = { (float) 11.0208, (float) 12.09, (float) 9.98 };
		int num[] = { (int) 99, (int) 98, (int) 100 };
		for (int i = 0; i < num.length; i++) {
			System.out.println(name[i] + num[i] + price[i]);
			dataOutputStream.writeUTF(name[i]);
			dataOutputStream.writeChar('\t');
			dataOutputStream.writeInt(num[i]);
			dataOutputStream.writeChar('\t');
			dataOutputStream.writeFloat(price[i]);
			dataOutputStream.writeChar('\n');
		}
		System.out.println(System.getProperty("file.encoding"));
		dataOutputStream.close();

	}

}
