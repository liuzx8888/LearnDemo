package thisdemo;

public class Person {

	String name;
	String Sex;
	int age;

	public Person(String name, String sex, int age) {
		super();
		this.name = name;
		this.Sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
