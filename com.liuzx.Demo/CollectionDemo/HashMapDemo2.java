package CollectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		
		Map<Person, String> map1 = new HashMap<Person, String>();	
		map1.put(new Person("����","29"), "����������");
		System.out.println(map1.get(new Person("����","29")));	
		/*
		 * ʹ���Զ����� ��Ϊ Key ʱ�����ֱ���������࣬��ΪKey �൱�� ������2�Σ��ڴ��ַ��һ���������޷�����
		 */
		
		Map<Person1, String> map = new HashMap<Person1, String>();
		map.put(new Person1("����",29), "����������");
		
		/*
		 * map ���Զ�������ΪKey ����д�� HashCode() equals() ��������ͨ���ڴ��ַ����ʶ�� 
		 */
		System.out.println(map.get(new Person1("����",29)));
		
	}

}
