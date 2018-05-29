package CollectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntrySetDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		/*
		 * ��ȡ���е�Key
		 */
		Set<String> keySet = map.keySet();
		Iterator<String> iterator1 = keySet.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		/*
		 * ��ȡ���е�Value
		 */
		Collection<Integer> ValueSet = map.values();
		Iterator<Integer> iterator2 = ValueSet.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		/*
		 * ��ȡmap �ĵ�����1
		 */
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator3 = entries.iterator();
		while (iterator3.hasNext()) {
			Map.Entry<String, Integer> entry = iterator3.next();
			System.out.println("Key:" + entry.getKey() + "   " + "Value:" + entry.getValue());
			System.out.println("**********************************************************");			
		}
		/*
		 * ��ȡmap �ĵ�����2
		 */
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key:" + entry.getKey() + "   " + "Value:" + entry.getValue());
			System.out.println("**********************************************************");	
		}

	}

}
