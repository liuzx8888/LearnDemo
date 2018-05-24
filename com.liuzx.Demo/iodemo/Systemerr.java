package iodemo;

public class Systemerr {
	public static void main(String[] args) {
		String str = "Test Systemerr";
		try {
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e);
			System.err.println(e);
		}

	}

}
