package exception;

public class exceptionDemo1 {
	private static int i = 1;
	private static int j = 0;

	public static void main(String[] args) {

		try {
			String str1 = args[0];
			String str2 = args[1];
			int ii = Integer.parseInt(str1);
			int jj = Integer.parseInt(str2);
			int k = i / j;

		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("算数异常");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("数字转换异常");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("数组越界");
		} finally {
			System.out.println("计算结束了");
		}

	}

}
