package threaddemo;

public class TestDemo2 {
	public static void main(String[] args) {
		ThreadDemo1 demo1 = new ThreadDemo1();
		Thread t1 = new Thread(demo1);
		Thread t2 = new Thread(demo1);
		Thread t3 = new Thread(demo1);
		t1.start();
		t2.start();
		t3.start();
	}

}
