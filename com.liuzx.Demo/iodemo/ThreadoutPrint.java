package iodemo;

import java.io.IOException;
import java.io.PipedOutputStream;

public class ThreadoutPrint implements Runnable {
	private PipedOutputStream outputStream = null;

	public ThreadoutPrint() {
		super();
		this.outputStream = new PipedOutputStream();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str1 = "Pipe Print";

		try {
			outputStream.write(str1.getBytes());
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public PipedOutputStream getOutputStream() {
		return outputStream;
	}

}
