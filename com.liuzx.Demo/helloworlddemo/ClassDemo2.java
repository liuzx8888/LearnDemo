package helloworlddemo;
public class ClassDemo2 {
	
	public static void main(String [] args) {

/***
 * �����Կ��Ա��޸�
 */
		ClassDemo1 classdemo1 = new ClassDemo1();
		System.out.println("��������ǰ:"+classdemo1.temp );
		fun(classdemo1);
		System.out.println("�������ú�:"+classdemo1.temp );		
/*
 * String ���Ͳ��ܱ��޸ĵ�
 * String ���Ͷ��ڴ����ÿռ���������޷����޸ĵģ�ֻ���޸�ջ�ڴ��ָ��		
 */
        String str2 = "Hello";
		System.out.println("��������ǰ:"+str2 );	
		funString(str2);
		System.out.println("��������ǰ:"+str2 );			
		
		
		/**
		 * ���ߴ��ݽ��	��String �������ݲ��ܱ��޸ģ��������ǿ��Ա��޸ĵģ�
		 */
			ClassDemo1 classdemo2 = new ClassDemo1();	
			classdemo2.str1 ="New HELLO";
			System.out.println("��������ǰ:"+ classdemo2.str1);		
			funClassDemo(classdemo2);
			System.out.println("�������ú�:"+ classdemo2.str1);				
			
	}

	public static void fun(ClassDemo1 d2) {
		d2.temp =1000;
		
	}
	
	public static void funString(String str3) {
		str3 ="World";
	}	
	public static void funClassDemo(ClassDemo1 classdemo2  ) {
		classdemo2.str1 ="New World";
	}
}


