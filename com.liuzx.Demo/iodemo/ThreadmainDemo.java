package iodemo;

import java.io.IOException;

public class ThreadmainDemo {
	public static void main(String[] args) {
		ThreadinPrint threadinPrint = new ThreadinPrint();
		ThreadoutPrint threadoutPrint = new ThreadoutPrint();
		Thread inthread = new Thread(threadinPrint);
		Thread outthread = new Thread(threadoutPrint);

		try {
			threadoutPrint.getOutputStream().connect(threadinPrint.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		outthread.start();
		inthread.start();

	}

}
