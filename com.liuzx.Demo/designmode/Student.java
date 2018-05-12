package designmode;

public class Student extends Person {
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("I am a Student");
	}

}
