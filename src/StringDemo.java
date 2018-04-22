
public class StringDemo {
	
   public static void main (String [] args) {
	   
	   String  str1= "Hello";
	   
	/*
	 * 字符串 转换成字符数组
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
	 * Byte 数组转换
	 */
	   	  
	  
	  byte b[] =str1.getBytes();
	  
	  for (int i=0;i< b.length;i++) {
		  System.out.println(c[i]);
	  }  
	  
	  System.out.println(new String(b));
	  System.out.println(new String(b,2,3));	  
	  System.out.println(b.length);
	  
	/*
	 * 是否存在，查找  
	 */
	  System.out.println(str2.indexOf("L")); 
	  System.out.println(str2.indexOf("L",3));
   }	

}
