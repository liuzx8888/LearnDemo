package SerializableDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws IOException {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Serializable.txt";
		File f = new File(path);
		InputStream in = new FileInputStream(f);
		ObjectInputStream inputStream = new ObjectInputStream(in);
		try {
			System.out.println(inputStream.readObject());
			inputStream.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
