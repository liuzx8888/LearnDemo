package abstractdemo;

public class Class1 extends AbstractClass1 {

	String name;

	@Override
	public String fun() {
		this.name = super.getName();
		// TODO Auto-generated method stub
		return this.name;
	}

	public static void main(String[] args) {
		Class1 class1 = new Class1();
		System.out.println(class1.fun());
	}

}
