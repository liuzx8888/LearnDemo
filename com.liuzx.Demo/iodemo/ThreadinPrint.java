package iodemo;

import java.io.IOException;
import java.io.PipedInputStream;

public class ThreadinPrint implements Runnable {
	private PipedInputStream inputStream = null;

	public ThreadinPrint() {
		super();
		this.inputStream = new PipedInputStream();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int temp;
		try {
			while ((temp = inputStream.read()) != -1) {
				System.out.println((char) temp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PipedInputStream getInputStream() {
		return inputStream;
	}

}
