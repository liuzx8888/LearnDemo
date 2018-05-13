package InnerClass;

public class InnerClass extends B {

	private String name = "liuzx";
	private int age = 30;
	private String City = "shanghai";
	private final String sex = "man";
	static String name1 = "liuzx_static";

	public String fun() {
		return "gg";
	}

	class InnerClass1 extends A {
		public String getname() {
			return name;
		}

		/*
		 * ��Ա�ڲ�������ⲿ��������Ա�뷽��
		 */

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			// super.eat();
			System.out.println("eat rice");
		}

	}

	/*
	 * �ֲ��ڲ��� ��Ա�ڲ�������ⲿ��������Ա�뷽�� ���ͳ�Ա�ڲ�����������ھֲ��ڲ���ķ��ʽ����ڷ����ڻ��߸��������ڡ�
	 */
	public void run(final String run) {
		class InnerClass2 {
			public void run1() {
				System.out.println("test run" + new InnerClass().fun() + run);
			}
		}
		InnerClass2 innerClass2 = new InnerClass2();
		innerClass2.run1();
	}
	/*
	 * �����ڲ��࣬ ��ʱû�ҵ�����
	 */

	/*
	 * ��̬�ڲ��� �� ��̬�ڲ���Ҳ�Ƕ�������һ����������ֻ࣬���������ǰ�����һ���ؼ���static��
	 * ��̬�ڲ����ǲ���Ҫ�������ⲿ��ģ�������ľ�̬��Ա�����е����ƣ�����������ʹ���ⲿ��ķ�static��Ա�������߷�����
	 * ���ܺ���⣬��Ϊ��û���ⲿ��Ķ��������£����Դ�����̬�ڲ���Ķ���
	 * �����������ⲿ��ķ�static��Ա�ͻ����ì�ܣ���Ϊ�ⲿ��ķ�static��Ա���������ھ���Ķ���
	 */
	static class InnerClass3 {
		public void print() {
			System.out.println(name1);
		}

	}

	public static void main(String[] agrs) {

		/* �ⲿ������ڲ��� */
		InnerClass innerClass = new InnerClass();
		InnerClass.InnerClass1 innerClass1 = innerClass.new InnerClass1();
		innerClass1.eat();
		System.out.println(innerClass1.getname());
		innerClass.run("a");

		InnerClass3 innerClass3 = new InnerClass3();
		innerClass3.print();
	}

}
