package TestManyType;

public class TestType {
	
@SuppressWarnings("unused")
public  static void main (String[] agrs) {	
	A a1 = new A();     //生成A类实例
	A a2 = new B();     //多态向上转型
	B b  = new B();     //生成B类实例
	C c  = new C();     //生成C类实例
	D d  = new D();     //生成D类实例   

	System.out.println(a1.show(b));   /*对象调用方法，但是没有对应的方法，但是 B类继承A类，调用show (A  obj)   		:A AND A*/ 
    System.out.println(a1.show(c));   /*对象调用方法，但是没有对应的方法，但是C继承B类，B类继承A类，调用show (A  obj)  :A AND A*/     
    System.out.println(a1.show(d));   /*对象调用方法，有对于的方法 调用 show (D  obj)  :A AND D*/     
    System.out.println(a2.show(b));   /*多态，向上转型  a2代表 A类，先找 是否有对应的 show(b) 方法，A类没有该方法，虽然在B类有，
    B继承A，多态的特性必须继承，而且相同的方法被重写，才能调用子类方法，show(b)未被重写，所以 b转换成A类调用show (A  obj)，同时show (A  obj) 被重写，所以调用子类的方法
          ：B AND A
    */ 
    System.out.println(a2.show(c));     /* 同上， A类没有show(c)方法，C继承B :B AND A */
    System.out.println(a2.show(d));     /* 同上， A类有show(d)方法， :A AND D */
    System.out.println(b.show(b));      /*  :  B AND B*/    
    System.out.println(b.show(c));      /*  : B类没有 show(c)方法，父类A 也没有该方法，C继承 B，转换成B，：B AND B */
    System.out.println(b.show(d));      /* B类没有show(d),到父类中寻找对应 show(c)方法，父类中存在，：A:D */  
	}
}
