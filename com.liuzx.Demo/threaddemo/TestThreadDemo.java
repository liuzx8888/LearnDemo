package threaddemo;

public class TestThreadDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ThreadDemo threadDemo1 = new ThreadDemo("����1");
		ThreadDemo threadDemo2 = new ThreadDemo("����2");
		/*
		 * public class Thread extends Object implements Runnable �ɴ˿��� Thread �� Runnable
		 * ������ start()������������һ���̣߳� һ���߳�ֻ�ܱ�����һ�� Start0()��������ϵͳ������ public native void
		 * start0();��Ҫ����ϵͳ֧�� public void run(){ if (target !=null) { target.run } }
		 * 
		 */
		/*
		 * threadDemo1.start(); threadDemo2.start();
		 */

		/*
		 * Runable �ӿ� Mythread �� thread ���� Runable �����࣬�� thread �� ���� Mythread
		 * ������Ϊ����������������ģʽ
		 * 
		 * 
		 * 
		 * Thread �̳� �����ܹ��� runable �ӿ��ܹ�ʵ����Դ�Ĺ���
		 */

		ThreadDemo1 demo1 = new ThreadDemo1("�߳�A");
		ThreadDemo1 demo2 = new ThreadDemo1("�߳�A");

		/*
		 * Thread thread1 = new Thread(demo1); Thread thread2 = new Thread(demo1);
		 */
		/*
		 * thread1.start(); thread2.start();
		 */

		/*
		 * 1.ȡ�ø������߳�����
		 */
		RunableDemo runableDemo = new RunableDemo();
		/*
		 * new Thread(runableDemo).start(); runableDemo.run(); new
		 * Thread(runableDemo,"�߳�-a").start(); new Thread(runableDemo).start();
		 */

		// �ж��߳��Ƿ�����
		Thread t1 = new Thread(runableDemo, "t1");
		Thread t2 = new Thread(runableDemo, "t2");
		Thread t3 = new Thread(runableDemo, "t3");
		System.out.println("�߳�״̬1��" + t1.isAlive());

		/*
		 * ��̨���� t1.setDaemon(true); t1.start();
		 */

		// �̵߳����ȼ�
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		if (t1.isAlive()) {
			t1.yield();
		}
		t1.start();
		t2.start();
		t3.start();

		// �߳�����

		try {
			t1.sleep(5000); // �߳�˯��
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t1.interrupt(); // �߳��ж�
		t1.isAlive();

		System.out.println("�߳�״̬2��" + t1.isAlive());

		try {

			// �߳�ǿ������
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
