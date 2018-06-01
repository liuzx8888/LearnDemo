package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUntilDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String arr[] = new String[] { "����", "��", "29", "����", "Ů", "28" };
		/*
		 * һ�������Ӷ�������
		 */
		Collections.addAll(list, arr);
		System.out.println(list);
		/*
		 * ��������
		 */
		System.out.println(Collections.binarySearch(list, "29"));
		/*
		 * �����滻
		 */
		Collections.replaceAll(list, "����", "����3");
		System.out.println(list);

		/*
		 * ����
		 */
		Collections.sort(list);
		System.out.println(list);

		/*
		 * ����λ��
		 */
		Collections.swap(list, 4, 5);
		System.out.println(list);
	}

}
