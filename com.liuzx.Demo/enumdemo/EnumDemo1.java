package enumdemo;

public class EnumDemo1 {
	public enum Color {
		Red, Blue, Yellow;
	}

	public static void printcc(Color c) {
		switch (c) {
		case Red: {
			System.out.println("红色");
			break;
		}
		case Blue: {
			System.out.println("蓝色");
			break;
		}
		case Yellow: {
			System.out.println("黄色");
			break;
		}
		default: {
			System.out.println("未知颜色");
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
