package exception;

public class exceptionDemo2 {

	public int math(int i, int j) throws MyException {
		int temp = 0;
		if (j == 0) {
			throw new MyException("��������Ϊ0");
		} else {
			temp = i / j;
		}

		return temp;

	}
}
