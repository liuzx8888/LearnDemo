package usualusedemo;

public class StringBufferDemo {

	public static void main(String[] args) {

		String var1 = "Hello";
		String var2 = "World";
		StringBuffer buffer;
		StringBuffer stringBuffer = new StringBuffer();
		buffer = stringBuffer.append(var1 + "  ").append(var2);

		System.out.println(buffer);
		buffer.insert(0, "China" + "  ");
		System.out.println(buffer);
		buffer.insert(buffer.length(), "   !!!!");
		System.out.println(buffer);
		/*
		 * 常用的String buffer 类方法
		 */
		System.out.println(buffer.toString().toUpperCase().indexOf("O"));
		System.out.println(buffer.toString().charAt(9));
		System.out.println(buffer.toString().replace("ll", "OO"));
		System.out.println(buffer.delete(2, 3));
		System.out.println(buffer.substring(4, 10));
		System.out.println(buffer.reverse());
	}

}
