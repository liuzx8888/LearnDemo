package filedemo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileDemo  {
	
	public static void main(String[] args) throws IOException {
		String strpath ="D:"+File.separator+"JavaTest"+File.separator+"test.txt"; 
		File f= new File(strpath);
		RandomAccessFile accessFile = new RandomAccessFile(f, "rw");
		accessFile.write(strpath.getBytes());
		
		RandomAccessFile accessFileread = new RandomAccessFile(f, "r");
		
		byte[] b = new byte[(int) f.length()];
		accessFileread.read(b);
		System.out.println(new String(b));

		
	}

}
