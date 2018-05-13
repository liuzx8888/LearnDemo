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
		 * 成员内部类访问外部类的任意成员与方法
		 */

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			// super.eat();
			System.out.println("eat rice");
		}

	}

	/*
	 * 局部内部类 成员内部类访问外部类的任意成员与方法 它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内。
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
	 * 匿名内部类， 暂时没找到例子
	 */

	/*
	 * 静态内部类 ： 静态内部类也是定义在另一个类里面的类，只不过在类的前面多了一个关键字static。
	 * 静态内部类是不需要依赖于外部类的，这点和类的静态成员属性有点类似，并且它不能使用外部类的非static成员变量或者方法，
	 * 这点很好理解，因为在没有外部类的对象的情况下，可以创建静态内部类的对象，
	 * 如果允许访问外部类的非static成员就会产生矛盾，因为外部类的非static成员必须依附于具体的对象。
	 */
	static class InnerClass3 {
		public void print() {
			System.out.println(name1);
		}

	}

	public static void main(String[] agrs) {

		/* 外部类调用内部类 */
		InnerClass innerClass = new InnerClass();
		InnerClass.InnerClass1 innerClass1 = innerClass.new InnerClass1();
		innerClass1.eat();
		System.out.println(innerClass1.getname());
		innerClass.run("a");

		InnerClass3 innerClass3 = new InnerClass3();
		innerClass3.print();
	}

}
