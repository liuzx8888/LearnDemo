package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {
	public static void main(String[] args) {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		String pathcopy = "D:" + File.separator + "JavaTest" + File.separator + "Iotestcopy.txt";
		File f1 = new File(path);
		File f2 = new File(pathcopy);
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (in != null && out != null) {
			int temp;
			try {
				while ((temp = in.read()) != -1) {
					out.write(temp);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
