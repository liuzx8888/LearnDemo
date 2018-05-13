package exception;

public class exceptionDemo2 {

	public void math(int i, int j) throws MyException {
		try {
			int temp = i / j;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}

	}

	public static void main(String[] args) {
		exceptionDemo2 exceptionDemo2 = new exceptionDemo2();
		try {
			exceptionDemo2.math(78, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(
					new MyException("除数为0").toString().substring(new MyException("除数为0").toString().indexOf(":") + 1));
		} finally {
			System.out.println("计算结束");
		}

	}

}
