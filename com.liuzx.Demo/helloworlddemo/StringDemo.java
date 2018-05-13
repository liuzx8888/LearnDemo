package helloworlddemo;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = "Hello";

		/*
		 * �ַ��� ת�����ַ�����
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
		 * Byte ����ת��
		 */

		byte b[] = str1.getBytes();

		for (int i = 0; i < b.length; i++) {
			System.out.println(c[i]);
		}

		System.out.println(new String(b));
		System.out.println(new String(b, 2, 3));
		System.out.println(b.length);

		/*
		 * �Ƿ���ڣ�����
		 */
		System.out.println(str2.indexOf("L"));
		System.out.println(str2.indexOf("L", 3));

		/**
		 * �ַ�����ȡ
		 */
		System.out.println(str2.substring(0, 3));

		/**
		 * �ַ����ָ�
		 */
		String ss = "Hello Java";
		String sss[] = ss.split(" ");
		for (int i = 0; i < sss.length; i++) {
			System.out.println(sss[i]);
		}

		/**
		 * �ַ�����Сд
		 */
		String dxx = "DDDhhhhhDDKF;LK;LKLK";
		System.out.println(dxx.toLowerCase());
		System.out.println(dxx.toUpperCase());

		/**
		 * �ַ������Դ�Сд
		 */
		String dxx1 = "dddhhhhhddkf;lk;lklk";
		String dxx2 = "DDDHHHHHDDKF;LK;LKLK";
		System.out.println(dxx1.equals(dxx2));
		System.out.println(dxx1.equalsIgnoreCase(dxx2));
		/**
		 * �ַ����жϿ�ͷ��β
		 */
		System.out.println(dxx1.startsWith("aa"));
		System.out.println(dxx1.endsWith("lk"));

		/*
		 * 
		 * �ַ����滻
		 * 
		 */
		System.out.println(dxx1.replaceAll("h", "i"));
		System.out.println(dxx1.replace("d", "g"));
	}

}
