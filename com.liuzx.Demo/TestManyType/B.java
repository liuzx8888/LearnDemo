package TestManyType;

public class B extends A {

	public String show(B obj) {

		return ("B AND B");
	}

	public String show(A obj) {

		return ("B AND A");
	}

}
