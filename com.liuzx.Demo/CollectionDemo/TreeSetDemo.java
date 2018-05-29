package CollectionDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet();
		treeset.add("张三");
		treeset.add("男");
		treeset.add("30");
		treeset.add("lili");
		treeset.add("女");
		treeset.add("26");
		treeset.add("lili");/*  加入重复元素*/
		treeset.add("女");
		treeset.add("26");
		System.out.println(treeset);
		
		TreeSet<Person> persons = new TreeSet<Person>();
		persons.add(new Person("张三", "29"));
		persons.add(new Person("李四", "30"));		
		persons.add(new Person("王五", "31"));
		persons.add(new Person("王五", "31")); /*  加入重复元素      TreeSet 加入自定义类 的去重复排序需要  实现 CompareTo 接口，String 已经实现过该接口，所以可以直接使用*/
		persons.add(new Person("孙六", "31")); /*  加入重复元素*/
		System.out.println(persons);
		
		
		Set <Person1> persons1 = new HashSet<Person1>();	
		persons1.add(new Person1("张三", 29));
		persons1.add(new Person1("李四", 30));		
		persons1.add(new Person1("王五", 31));
		persons1.add(new Person1("王五", 31)); /*  加入重复元素，  自定义类去重  Hashset  需要重写  equals HashCode  方法/
		persons1.add(new Person1("孙六", 31)); /*  加入重复元素*/
		System.out.println(persons1);		
		
	}

}
