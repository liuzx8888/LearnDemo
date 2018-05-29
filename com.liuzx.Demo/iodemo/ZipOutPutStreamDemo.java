package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutPutStreamDemo {

	public static void main(String[] args) throws IOException {
		String file1 = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		String Zipfile1 = "D:" + File.separator + "JavaTest" + File.separator + "IotestZip.Zip";
		File f = new File(file1);
		File zipf = new File(Zipfile1);
		InputStream in = new FileInputStream(f);
		ZipOutputStream zipOut = null;
		zipOut = new ZipOutputStream(new FileOutputStream(zipf));
		zipOut.putNextEntry(new ZipEntry(f.getName()));
		zipOut.setComment(" Test ZipOutPutStream");
		int temp = 0;
		while ((temp = in.read()) != -1) {
			zipOut.write(temp);
		}
		in.close();
		zipOut.close();
	}

}
