package staticcodedemo;

public class StaticCodeDemo1 {
	/*
	 * ÿ�����ɶ��󶼻�ִ��
	 */
	{
		System.out.println("1.��������");
	}
	/*
	 * ��̬�����ִֻ��һ��
	 */

	static {
		System.out.println("0.��������");
	}

	private StaticCodeDemo1() {
		// TODO Auto-generated constructor stub
		System.out.println("2.���췽��");
	}

	private static StaticCodeDemo1 staticCodeDemo1 = new StaticCodeDemo1();

	/*
	 * ����ģʽ
	 */
	public static StaticCodeDemo1 getinstance() {
		return staticCodeDemo1;
	}

}
