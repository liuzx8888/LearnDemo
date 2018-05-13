package helloworlddemo;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = "Hello";

		/*
		 * ×Ö·û´® ×ª»»³É×Ö·ûÊý×é
		 */

		char c[] = str1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		String str2 = new String(c);
		String str3 = new String(c, 1, 3);
		System.out.println(str2);
		System.out.println(str3);

		/*
		 * Byte Êý×é×ª»»
		 */

		byte b[] = str1.getBytes();

		for (int i = 0; i < b.length; i++) {
			System.out.println(c[i]);
		}

		System.out.println(new String(b));
		System.out.println(new String(b, 2, 3));
		System.out.println(b.length);

		/*
		 * ÊÇ·ñ´æÔÚ£¬²éÕÒ
		 */
		System.out.println(str2.indexOf("L"));
		System.out.println(str2.indexOf("L", 3));

		/**
		 * ×Ö·û´®½ØÈ¡
		 */
		System.out.println(str2.substring(0, 3));

		/**
		 * ×Ö·û´®·Ö¸î
		 */
		String ss = "Hello Java";
		String sss[] = ss.split(" ");
		for (int i = 0; i < sss.length; i++) {
			System.out.println(sss[i]);
		}

		/**
		 * ×Ö·û´®´óÐ¡Ð´
		 */
		String dxx = "DDDhhhhhDDKF;LK;LKLK";
		System.out.println(dxx.toLowerCase());
		System.out.println(dxx.toUpperCase());

		/**
		 * ×Ö·û´®ºöÂÔ´óÐ¡Ð´
		 */
		String dxx1 = "dddhhhhhddkf;lk;lklk";
		String dxx2 = "DDDHHHHHDDKF;LK;LKLK";
		System.out.println(dxx1.equals(dxx2));
		System.out.println(dxx1.equalsIgnoreCase(dxx2));
		/**
		 * ×Ö·û´®ÅÐ¶Ï¿ªÍ·½áÎ²
		 */
		System.out.println(dxx1.startsWith("aa"));
		System.out.println(dxx1.endsWith("lk"));

		/*
		 * 
		 * ×Ö·û´®Ìæ»»
		 * 
		 */
		System.out.println(dxx1.replaceAll("h", "i"));
		System.out.println(dxx1.replace("d", "g"));
	}

}
