package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ArraryListDemo {
	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<String>();
		Collection<String> collection = new ArrayList<String>();
		arrlist.add("����");
		arrlist.add("��");
		arrlist.add("30");
		System.out.println(arrlist);
		for (String arrlist1 : arrlist) {
			System.out.println(arrlist1);
		}
		/*�������*/
		collection.add("����");
		collection.add("��");
		collection.add("38");
		/*���һ������*/
		arrlist.addAll(collection);
		System.out.println(arrlist);
		/*ת��������*/
		String str[]  = new String[] {};  
		str= arrlist.toArray(str);
		for (int i = 0; i < str.length ;i++) {
			System.out.println(str[i]);
		}
		/*�Ƴ�����*/
		arrlist.remove(0);
		arrlist.remove("����");
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}

		System.out.println(arrlist);
		/*�Ƴ�һ������*/
		arrlist.removeAll(collection);
		System.out.println(arrlist);
		/*��ȡ��������*/
		System.out.println(arrlist.subList(0, 1));
	}

}
