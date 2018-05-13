package staticcodedemo;

public class StaticCodeDemo1 {
	/*
	 * 每次生成对象都会执行
	 */
	{
		System.out.println("1.构造代码快");
	}
	/*
	 * 静态代码块只执行一次
	 */

	static {
		System.out.println("0.构造代码快");
	}

	private StaticCodeDemo1() {
		// TODO Auto-generated constructor stub
		System.out.println("2.构造方法");
	}

	private static StaticCodeDemo1 staticCodeDemo1 = new StaticCodeDemo1();

	/*
	 * 单例模式
	 */
	public static StaticCodeDemo1 getinstance() {
		return staticCodeDemo1;
	}

}
