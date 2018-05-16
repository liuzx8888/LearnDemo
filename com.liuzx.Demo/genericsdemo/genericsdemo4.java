package genericsdemo;

/* 
 * 泛型的下限：只允许本类 跟父类使用
 * 
 */
public class genericsdemo4<T> {

	private T var1;

	public T getVar1() {
		return var1;
	}

	/*
	 * public void setVar1(T var1) { this.var1 = var1; }
	 */

	public void getProperty(GenericsDemo2<? super String, ? super Number, ? super Integer> temp) {
		System.out.println(temp.getVar1());
		System.out.println(temp.getVar2());
		System.out.println(temp.getVar3());
	}
	
	public static void main(String[] args) {
		genericsdemo4<String> genericsdemo4 = new genericsdemo4<String>();
		GenericsDemo2<String, Number, Integer> demo2  = new GenericsDemo2<String, Number, Integer>("aa", 12, 11);
		genericsdemo4.getProperty(demo2);
	}

}