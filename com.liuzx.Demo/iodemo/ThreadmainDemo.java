package iodemo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ThreadmainDemo {
	public static void main(String[] args) {
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		ThreadInDemo inDemo = new ThreadInDemo();
		ThreadOutDemo outDemo = new ThreadOutDemo();
		new ThreadInDemo().receive(in);
		new ThreadOutDemo().send(out);

		try {
			out.connect(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new Thread(inDemo).start();
		new Thread(outDemo).start();

	}
}
