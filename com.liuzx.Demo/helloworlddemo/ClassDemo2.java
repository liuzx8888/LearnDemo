package helloworlddemo;
public class ClassDemo2 {
	
	public static void main(String [] args) {

/***
 * 类属性可以被修改
 */
		ClassDemo1 classdemo1 = new ClassDemo1();
		System.out.println("方法调用前:"+classdemo1.temp );
		fun(classdemo1);
		System.out.println("方法调用后:"+classdemo1.temp );		
/*
 * String 类型不能被修改的
 * String 类型堆内存分配好空间后，内容是无法被修改的，只能修改栈内存的指向。		
 */
        String str2 = "Hello";
		System.out.println("方法调用前:"+str2 );	
		funString(str2);
		System.out.println("方法调用前:"+str2 );			
		
		
		/**
		 * 二者传递结合	（String 传递内容不能被修改，类属性是可以被修改的）
		 */
			ClassDemo1 classdemo2 = new ClassDemo1();	
			classdemo2.str1 ="New HELLO";
			System.out.println("方法调用前:"+ classdemo2.str1);		
			funClassDemo(classdemo2);
			System.out.println("方法调用后:"+ classdemo2.str1);				
			
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


