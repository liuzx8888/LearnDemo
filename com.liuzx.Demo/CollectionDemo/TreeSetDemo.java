package CollectionDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet();
		treeset.add("����");
		treeset.add("��");
		treeset.add("30");
		treeset.add("lili");
		treeset.add("Ů");
		treeset.add("26");
		treeset.add("lili");/*  �����ظ�Ԫ��*/
		treeset.add("Ů");
		treeset.add("26");
		System.out.println(treeset);
		
		TreeSet<Person> persons = new TreeSet<Person>();
		persons.add(new Person("����", "29"));
		persons.add(new Person("����", "30"));		
		persons.add(new Person("����", "31"));
		persons.add(new Person("����", "31")); /*  �����ظ�Ԫ��      TreeSet �����Զ����� ��ȥ�ظ�������Ҫ  ʵ�� CompareTo �ӿڣ�String �Ѿ�ʵ�ֹ��ýӿڣ����Կ���ֱ��ʹ��*/
		persons.add(new Person("����", "31")); /*  �����ظ�Ԫ��*/
		System.out.println(persons);
		
		
		Set <Person1> persons1 = new HashSet<Person1>();	
		persons1.add(new Person1("����", 29));
		persons1.add(new Person1("����", 30));		
		persons1.add(new Person1("����", 31));
		persons1.add(new Person1("����", 31)); /*  �����ظ�Ԫ�أ�  �Զ�����ȥ��  Hashset  ��Ҫ��д  equals HashCode  ����/
		persons1.add(new Person1("����", 31)); /*  �����ظ�Ԫ��*/
		System.out.println(persons1);		
		
	}

}
