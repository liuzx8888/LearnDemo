package threaddemo;

public class TestThreadDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ThreadDemo threadDemo1 = new ThreadDemo("进程1");
		ThreadDemo threadDemo2 = new ThreadDemo("进程2");
		/*
		 * public class Thread extends Object implements Runnable 由此看出 Thread 是 Runnable
		 * 的子类 start()方法用来启动一个线程， 一个线程只能被启动一次 Start0()方法调用系统函数， public native void
		 * start0();需要操作系统支持 public void run(){ if (target !=null) { target.run } }
		 * 
		 */
		/*
		 * threadDemo1.start(); threadDemo2.start();
		 */

		/*
		 * Runable 接口 Mythread 跟 thread 都是 Runable 的子类，用 thread 类 传进 Mythread
		 * 子类作为参数，类似与代理的模式
		 * 
		 * 
		 * 
		 * Thread 继承 对象不能共享 runable 接口能够实现资源的共享
		 */

		ThreadDemo1 demo1 = new ThreadDemo1("线程A");
		ThreadDemo1 demo2 = new ThreadDemo1("线程A");

		/*
		 * Thread thread1 = new Thread(demo1); Thread thread2 = new Thread(demo1);
		 */
		/*
		 * thread1.start(); thread2.start();
		 */

		/*
		 * 1.取得跟设置线程名称
		 */
		RunableDemo runableDemo = new RunableDemo();
		/*
		 * new Thread(runableDemo).start(); runableDemo.run(); new
		 * Thread(runableDemo,"线程-a").start(); new Thread(runableDemo).start();
		 */

		// 判断线程是否启动
		Thread t1 = new Thread(runableDemo, "t1");
		Thread t2 = new Thread(runableDemo, "t2");
		Thread t3 = new Thread(runableDemo, "t3");
		System.out.println("线程状态1：" + t1.isAlive());

		/*
		 * 后台进程 t1.setDaemon(true); t1.start();
		 */

		// 线程的优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		if (t1.isAlive()) {
			t1.yield();
		}
		t1.start();
		t2.start();
		t3.start();

		// 线程礼让

		try {
			t1.sleep(5000); // 线程睡眠
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t1.interrupt(); // 线程中断
		t1.isAlive();

		System.out.println("线程状态2：" + t1.isAlive());

		try {

			// 线程强制启用
			for (int i = 0; i < 10; i++) {
				if (i > 10) {
					t1.join();
				}
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
