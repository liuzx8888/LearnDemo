package threaddemo;

public class ThreadDemo1 implements Runnable {

	private String name;
	private int ticketcount = 10;

	public ThreadDemo1() {
		super();
	}

	public ThreadDemo1(String name) {
		super();
		this.name = name;
	}

	public synchronized void sale() {
		if (ticketcount > 0) {
			try {
				Thread.sleep(300);
				System.out.println("当前余票:" + ticketcount--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i < 10; i++) {
			// System.out.println(name + ":" + i);
			this.sale();
			/*
			 * if (ticketcount > 0) { try {
			 * 
			 * 同步块
			 * 
			 * synchronized (this) { Thread.sleep(300); System.out.println("ticket:" +
			 * ticketcount--); }
			 * 
			 * 
			 * } catch (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 * 
			 * }
			 */

		}
	}
}
