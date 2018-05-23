package iodemo;

import java.io.IOException;
import java.io.PipedOutputStream;

public class ThreadOutDemo implements Runnable {
	private PipedOutputStream out;

	public void send(PipedOutputStream outputStream) {
		this.out = outputStream;
	}

	@Override
	public void run() {
		String str1 = "Hello World";
		// TODO Auto-generated method stub
		byte[] b = new byte[1024];
		try {
			this.out.write(str1.getBytes());
			this.out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
