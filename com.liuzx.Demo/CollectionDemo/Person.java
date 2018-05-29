package CollectionDemo;

public class Person  implements Comparable<Person> {

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	
	

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if (Integer.parseInt(this.age)>Integer.parseInt(o.age)) {
			return -1;
		}
		if (Integer.parseInt(this.age)<Integer.parseInt(o.age)) {
			return 1;
		}	
		else
			return this.name.compareTo(o.name);  /*String   已经实现了compareTo 接口 */
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
