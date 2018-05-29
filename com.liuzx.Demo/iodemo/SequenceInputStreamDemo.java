package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		String file1 = "D:" + File.separator + "JavaTest" + File.separator + "Iotestcopy.txt";
		String file2 = "D:" + File.separator + "JavaTest" + File.separator + "text.txt";
		String file3 = "D:" + File.separator + "JavaTest" + File.separator + "all.txt";
		File f1 = new File(file1);
		File f2 = new File(file2);
		File f3 = new File(file3);
		InputStream In1 = new FileInputStream(f1);
		InputStream In2 = new FileInputStream(f2);
		FileOutputStream In3 = new FileOutputStream(f3);
		SequenceInputStream sis = new SequenceInputStream(In2, In1);
		int temp = 0;
		while ((temp = sis.read()) != -1) {
			In3.write(temp);
		}
		In1.close();
		In2.close();
		In3.close();
		sis.close();
	}

}
