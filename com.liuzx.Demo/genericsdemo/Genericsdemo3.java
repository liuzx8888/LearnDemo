package genericsdemo;
/*
 * 泛型的上限
 * 允许本类与子类传递类型
 */
public class Genericsdemo3<T extends Number> {
	private T i;

	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}

	public static void main(String[] args) {
		Genericsdemo3<Integer> genericsdemo3 =new  Genericsdemo3<Integer> ();
		genericsdemo3.setI(11);
		Genericsdemo3<Long> genericsdemo31 =new  Genericsdemo3<Long> ();
		genericsdemo31.setI(10L);
/*		错误示例：
		Genericsdemo3<String> genericsdemo32 =new  Genericsdemo3<String> ();*/
		
	}

}
