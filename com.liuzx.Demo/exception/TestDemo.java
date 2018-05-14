package exception;

public class TestDemo {
	public static void main(String[] args) {
		exceptionDemo2 exceptionDemo2 = new exceptionDemo2();

		try {
			exceptionDemo2.math(78, 0);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
