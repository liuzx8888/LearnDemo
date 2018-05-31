package enumdemo;

public class EnumDemo1 {
	public enum Color {
		Red, Blue, Yellow;
	}

	public static void printcc(Color c) {
		switch (c) {
		case Red: {
			System.out.println("��ɫ");
			break;
		}
		case Blue: {
			System.out.println("��ɫ");
			break;
		}
		case Yellow: {
			System.out.println("��ɫ");
			break;
		}
		default: {
			System.out.println("δ֪��ɫ");
			break;
		}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color c = Color.Blue;
		System.out.println(c);
		for (Color cc : Color.values()) {
			printcc(cc);
			System.out.println(cc.ordinal() + "--------->" + cc.name());

		}

	}

}
