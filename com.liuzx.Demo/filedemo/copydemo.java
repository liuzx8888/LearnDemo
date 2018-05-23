package filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class copydemo {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String path1 ="D:"+File.separator+"test.txt";
		String path2 ="D:"+File.separator+"testCopy.txt";
		
		File file1 = new File(path1);
		File file2 = new File(path2);
		OutputStream outputStream =null;
		InputStream inputStream = null;
		
		inputStream  = new FileInputStream(file1);
		outputStream = new FileOutputStream(file2);
        outputStream.write(path1.getBytes());
		
		if (inputStream != null && outputStream != null) {
			int temp ;
			while ((temp = inputStream.read()) != -1) {
				outputStream.write(temp);
			}
		}
		
		
		
	}

}
