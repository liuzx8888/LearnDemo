package CollectionDemo;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		sortedSet.add("����");
		sortedSet.add("��");
		sortedSet.add("30");
		sortedSet.add("����");
		sortedSet.add("��");
		sortedSet.add("22");

		/*
		 * System.out.println(sortedSet); 
		 * System.out.println(sortedSet.first()); ��һ��Ԫ��
		 * System.out.println(sortedSet.last());  ���һ��Ԫ��
		 * System.out.println(sortedSet.headSet("��")); ָ��Ԫ��֮ǰ������
		 * System.out.println(sortedSet.tailSet("����")); ָ��Ԫ��֮�������
		 * System.out.println(sortedSet.subSet("22", "����"));ָ����Χ�ڵ�����
		 */
		 /*
		  * ɾ��ָ������
		  */
        String str = null;
		Iterator<String> iterator = sortedSet.iterator();
		while (iterator.hasNext()) {
			str = iterator.next();
			if ("��".equals(str)) {
				iterator.remove();	
			}
			System.out.println(sortedSet);
		}

	}

}
