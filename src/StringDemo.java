
public class StringDemo {
	
   public static void main (String [] args) {
	   
	   String  str1= "Hello";
	   
	/*
	 * �ַ��� ת�����ַ�����
	 */
	   
	  char c [] = str1.toCharArray();
	  for (int i=0;i< c.length;i++) {
		  System.out.println(c[i]);
	  }
	   
	  String str2 = new String (c);
	  String str3 = new String (c,1,3);
	  System.out.println(str2);
	  System.out.println(str3);	 

	  
	   
	/*
	 * Byte ����ת��
	 */
	   	  
	  
	  byte b[] =str1.getBytes();
	  
	  for (int i=0;i< b.length;i++) {
		  System.out.println(c[i]);
	  }  
	  
	  System.out.println(new String(b));
	  System.out.println(new String(b,2,3));	  
	  System.out.println(b.length);
	  
	/*
	 * �Ƿ���ڣ�����  
	 */
	  System.out.println(str2.indexOf("L")); 
	  System.out.println(str2.indexOf("L",3));
   }	

}
