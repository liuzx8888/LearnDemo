package usualusedemo;

import java.io.IOException;

public class RunTimeDemo {

	public static void main(String[] args) throws InterruptedException {
		Process process = null;
		Runtime runtime = Runtime.getRuntime();
		System.out.println(" Jvm �ڴ����:" + runtime.totalMemory() + "\r\n Jvm �����ڴ�:" + runtime.freeMemory()
				+ "\r\n Jvm ����ڴ�:" + runtime.maxMemory()

		);

		try {
			process = runtime.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread.sleep(1500);
		process.destroy();
		runtime.gc();

	}

}
