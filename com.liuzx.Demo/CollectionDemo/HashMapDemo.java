package CollectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("张三", 20);
		map.put("李四", 30);
		map.put("王五", 25);
		map.put("孙六", 35);
		map.put("张三", 20);
		System.out.println(map);
		System.out.println(map.get("张三"));
		System.out.println(map.containsKey("孙六"));
		Set<String> keySet = map.keySet();
		Collection<Integer> Value = map.values();

		/*
		 * 获取所有的Key
		 */
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		/*
		 * 获取所有的Value
		 */
		Iterator<Integer> Value_iterator = Value.iterator();
		while (Value_iterator.hasNext()) {
			System.out.println(Value_iterator.next());
		}

		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator2 = set.iterator();

		while (iterator2.hasNext()) {
			Map.Entry<String, Integer> me = iterator2.next();
			System.out.println("Key:" + me.getKey() + "|" + "Value:" + me.getValue());

		}

	}

}
