package genericsdemo;

/*
 *  ������ ����
 */
public class GenericsDemo2<K, V, T> {
	private K var1;
	private T var2;
	private V var3;

	public GenericsDemo2() {
		super();
	}

	public GenericsDemo2(K var1, T var2, V var3) {
		super();
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}

	public K getVar1() {
		return var1;
	}

	public void setVar1(K var1) {
		this.var1 = var1;
	}

	public T getVar2() {
		return var2;
	}

	public void setVar2(T var2) {
		this.var2 = var2;
	}

	public V getVar3() {
		return var3;
	}

	public void setVar3(V var3) {
		this.var3 = var3;
	}

	/*
	 * �������ܷ������͵Ķ��� ֻ�ܷ��͵����ö���Ĵ���, 1.ֱ��ָ�����͵����� GenericsDemo1<Sring> 2.ʹ��ͨ���?
	 * enericsDemo1<?> 3.ͨ�������ֻ�ܽ��ܶ��󣬲������� ���ֵ
	 */
	public void fun(GenericsDemo1<?> demo1) {
		System.out.println(demo1.getVar());
	}

	public static void main(String[] args) {
		GenericsDemo2<String, Number, Long> genericsDemo2 = new GenericsDemo2<String, Number, Long>();
		genericsDemo2.setVar1("Var1");
		genericsDemo2.setVar2(100L);
		genericsDemo2.setVar3(100.89);
		System.out.println(genericsDemo2.getVar1() + genericsDemo2.getVar2() + genericsDemo2.getVar3());

		GenericsDemo1<String> genericsDemo1 = new GenericsDemo1<String>("Demo1");
		genericsDemo2.fun(genericsDemo1);
		/*
		 * ͨ�������ֻ�ܽ��ܶ��󣬲������� ���ֵ GenericsDemo1<?> genericsDemo12= new
		 * GenericsDemo1<String>("Demo2"); genericsDemo12.setVar("aaa");
		 */
	}

}
