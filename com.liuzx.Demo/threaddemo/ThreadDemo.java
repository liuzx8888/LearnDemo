package threaddemo;

public class ThreadDemo extends Thread {
	private String name;

	public ThreadDemo() {
		super();
	}

	public ThreadDemo(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(name + ":" + i);

		}

	}
}
