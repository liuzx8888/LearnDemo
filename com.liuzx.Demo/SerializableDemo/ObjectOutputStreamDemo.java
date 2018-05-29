package SerializableDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException {

		String path = "D:" + File.separator + "JavaTest" + File.separator + "Serializable.txt";
		File f = new File(path);
		OutputStream out = new FileOutputStream(f);
		ObjectOutputStream outputStream = new ObjectOutputStream(out);
		outputStream.writeObject(new Person("ÕÅÈý", "ÄÐ", 29));
		outputStream.close();

	}

}
