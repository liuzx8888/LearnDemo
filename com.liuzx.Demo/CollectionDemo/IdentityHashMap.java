package CollectionDemo;

import java.util.Map;

public class IdentityHashMap {
public static void main(String[] args) {
		Map<Person, String> map = new java.util.IdentityHashMap<Person, String>();
		map.put(new Person("����","29"), "A");
		map.put(new Person("����","29"), "B");
		map.put(new Person("����","30"), "C");
		map.put(new Person("����","31"), "C");	
		map.put(new Person("����","35"), "D");
		System.out.println(map);
		
}
}
