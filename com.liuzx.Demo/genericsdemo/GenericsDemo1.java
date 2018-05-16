package genericsdemo;

public class GenericsDemo1<T> {
	private T var;

	/*
	 * ���͵Ĺ��췽��
	 * ���͵����� �����಻��ֱ�Ӽ̳�
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
	 * ���淺��Demo
	 */
	public static void main(String[] args) {
		GenericsDemo1<String> genericsDemo1 = new GenericsDemo1<String>("HelloWorld");
		System.out.println(genericsDemo1.getVar());
		
		/*������ ���� ������ ����ֱ�Ӵ��ݣ���̬�޷�ʹ��
		 *������ ��������
		 * 		GenericsDemo1<Object> genericsDemo222 =genericsDemo1;
		 */
		GenericsDemo1<?> genericsDemo222 = genericsDemo1;


		GenericsDemo1<Integer> genericsDemo12 = new GenericsDemo1<Integer>(112233);
		System.out.println(genericsDemo12.getVar());

		/*
		 * ������˵���ĸ����ͣ�����־��� ���ָ����ȷ���;���ָ�����ͣ���ָ��������;��� object ����: new GenericsDemo1<object>
		 */
		GenericsDemo1 genericsDemo13 = new GenericsDemo1("HelloWorld_Warn");
		System.out.println(genericsDemo13.getVar());

	}

}
