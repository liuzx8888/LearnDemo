package genericsdemo;

public class GenericsDemo5<T> implements GenericsInterface<T> {

	/*
	 * ���ͷ��� ��ʽ [����Ȩ��][���ͱ�ʶ] ���ͱ�ʶ ������ (���ͱ�ʶ ��������) pulic <T> T fun(T var1)
	 */
	/*
	 * ���ط�������ķ���  [����Ȩ��][���ͱ�ʶ] ���ͱ�ʶ[] 
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
	 * ע�����ɶ���� ���͵�ָ������
	 */
	public static void main(String[] args) {
		GenericsDemo5<String> demo5 = new GenericsDemo5<String> ();
		System.out.println(demo5.fun1("aaa"));

		GenericsDemo5<Integer> demo6 = new GenericsDemo5<Integer> ();
		 Integer[] arr = demo6.fun2(1,2,3,6,7,8);
		for (Integer i : arr) {
			System.out.println(i.intValue());  /*װ�� ����*/
		}

	}

}
