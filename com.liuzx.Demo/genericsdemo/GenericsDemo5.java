package genericsdemo;

public class GenericsDemo5<T> implements GenericsInterface<T> {

	/*
	 * 泛型方法 格式 [访问权限][泛型标识] 泛型标识 方法名 (泛型标识 变量名称) pulic <T> T fun(T var1)
	 */
	/*
	 * 返回泛型数组的方法  [访问权限][泛型标识] 泛型标识[] 
	 */

	@Override
	public <T> T fun1(T var1) {
		// TODO Auto-generated method stub
		return var1;
	}
	
	public <T> T[] fun2(T ... arg) {
		return  arg;
	}

	/*
	 * 注意生成对象的 泛型的指定类型
	 */
	public static void main(String[] args) {
		GenericsDemo5<String> demo5 = new GenericsDemo5<String> ();
		System.out.println(demo5.fun1("aaa"));

		GenericsDemo5<Integer> demo6 = new GenericsDemo5<Integer> ();
		 Integer[] arr = demo6.fun2(1,2,3,6,7,8);
		for (Integer i : arr) {
			System.out.println(i.intValue());  /*装箱 拆箱*/
		}

	}

}
