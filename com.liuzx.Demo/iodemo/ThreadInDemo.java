package iodemo;

import java.io.IOException;
import java.io.PipedInputStream;

public class ThreadInDemo implements Runnable {
	private PipedInputStream input;


	public void receive( PipedInputStream inputStream) {

		this.input  = inputStream;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		byte[] b = new byte[1024];
		int temp;
		try {
			temp = this.input.read(b);/* 读取 输入信息 */
			this.input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new String(b));

	}

	public PipedInputStream getInput() {
		return input;
	}

}
