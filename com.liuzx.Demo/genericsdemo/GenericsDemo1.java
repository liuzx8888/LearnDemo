package genericsdemo;

public class GenericsDemo1<T> {
	private T var;

	/*
	 * 泛型的构造方法
	 * 泛型的子类 跟父类不能直接继承
	 */
	public GenericsDemo1(T var) {
		super();
		this.var = var;
	}

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	/*
	 * 常规泛型Demo
	 */
	public static void main(String[] args) {
		GenericsDemo1<String> genericsDemo1 = new GenericsDemo1<String>("HelloWorld");
		System.out.println(genericsDemo1.getVar());
		
		/*泛型中 子类 跟父类 不能直接传递，多态无法使用
		 *可以用 ？来接收
		 * 		GenericsDemo1<Object> genericsDemo222 =genericsDemo1;
		 */
		GenericsDemo1<?> genericsDemo222 = genericsDemo1;


		GenericsDemo1<Integer> genericsDemo12 = new GenericsDemo1<Integer>(112233);
		System.out.println(genericsDemo12.getVar());

		/*
		 * 不具体说明哪个类型，会出现警告 如果指定明确类型就是指定类型，不指定相关类型就是 object 例如: new GenericsDemo1<object>
		 */
		GenericsDemo1 genericsDemo13 = new GenericsDemo1("HelloWorld_Warn");
		System.out.println(genericsDemo13.getVar());

	}

}
