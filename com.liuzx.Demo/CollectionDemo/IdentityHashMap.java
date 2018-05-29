package CollectionDemo;

import java.util.Map;

public class IdentityHashMap {
public static void main(String[] args) {
		Map<Person, String> map = new java.util.IdentityHashMap<Person, String>();
		map.put(new Person("张三","29"), "A");
		map.put(new Person("张三","29"), "B");
		map.put(new Person("李四","30"), "C");
		map.put(new Person("王五","31"), "C");	
		map.put(new Person("孙六","35"), "D");
		System.out.println(map);
		
}
}
