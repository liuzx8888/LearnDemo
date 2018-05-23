package usualusedemo;

import java.util.Arrays;

public class ComparableDemo implements Comparable<ComparableDemo> {
	private int age;
	private int score;
	private String name;

	public ComparableDemo(int age, int score, String name) {
		super();
		this.age = age;
		this.score = score;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Compareto [age=" + age + ", score=" + score + ", name=" + name + "]";
	}

	@Override
	public int compareTo(ComparableDemo comp) {
		// TODO Auto-generated method stub
		if (this.score > comp.score) {
			return -1;
		} else {
			return 1;
		}

	}
	public static void main(String[] args) {
		ComparableDemo compareto[] = {
				new ComparableDemo(10, 68, "demo1"),
				new ComparableDemo(11, 68, "demo2"),
				new ComparableDemo(10, 88, "demo3"),
				new ComparableDemo(10, 78, "demo4")
				};
	    Arrays.sort(compareto);
	    System.out.println(Arrays.toString(compareto));
	}
	
	
}
