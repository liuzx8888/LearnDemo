package TestManyType;

public class TestType {
	
@SuppressWarnings("unused")
public  static void main (String[] agrs) {	
	A a1 = new A();     //����A��ʵ��
	A a2 = new B();     //��̬����ת��
	B b  = new B();     //����B��ʵ��
	C c  = new C();     //����C��ʵ��
	D d  = new D();     //����D��ʵ��   

	System.out.println(a1.show(b));   /*������÷���������û�ж�Ӧ�ķ��������� B��̳�A�࣬����show (A  obj)   		:A AND A*/ 
    System.out.println(a1.show(c));   /*������÷���������û�ж�Ӧ�ķ���������C�̳�B�࣬B��̳�A�࣬����show (A  obj)  :A AND A*/     
    System.out.println(a1.show(d));   /*������÷������ж��ڵķ��� ���� show (D  obj)  :A AND D*/     
    System.out.println(a2.show(b));   /*��̬������ת��  a2���� A�࣬���� �Ƿ��ж�Ӧ�� show(b) ������A��û�и÷�������Ȼ��B���У�
    B�̳�A����̬�����Ա���̳У�������ͬ�ķ�������д�����ܵ������෽����show(b)δ����д������ bת����A�����show (A  obj)��ͬʱshow (A  obj) ����д�����Ե�������ķ���
          ��B AND A
    */ 
    System.out.println(a2.show(c));     /* ͬ�ϣ� A��û��show(c)������C�̳�B :B AND A */
    System.out.println(a2.show(d));     /* ͬ�ϣ� A����show(d)������ :A AND D */
    System.out.println(b.show(b));      /*  :  B AND B*/    
    System.out.println(b.show(c));      /*  : B��û�� show(c)����������A Ҳû�и÷�����C�̳� B��ת����B����B AND B */
    System.out.println(b.show(d));      /* B��û��show(d),��������Ѱ�Ҷ�Ӧ show(c)�����������д��ڣ���A:D */  
	}
}
