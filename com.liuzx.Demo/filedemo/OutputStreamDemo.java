package filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		String strpath ="D:"+File.separator+"JavaTest"+File.separator+"test.txt";
		File f = new File (strpath);
		OutputStream outputStream = new FileOutputStream(f,true);
		outputStream.write(strpath.getBytes());
/*		outputStream.close();*/
		
		
/*
 *     字节流 转换成 字符流
 */
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		outputStreamWriter.write("Hello String China");
		outputStreamWriter.close();
	}

}
