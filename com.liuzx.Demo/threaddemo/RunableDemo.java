package threaddemo;

public class RunableDemo implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++) {
			/*
			 * 获取当前线程的名称
			 */
			System.out.println( Thread.currentThread().getName()+":"+ i--);
		}

	}

}
