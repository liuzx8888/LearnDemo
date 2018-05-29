package CollectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		
		Map<Person, String> map1 = new HashMap<Person, String>();	
		map1.put(new Person("张三","29"), "至少三撒啊");
		System.out.println(map1.get(new Person("张三","29")));	
		/*
		 * 使用自定义类 作为 Key 时候，如果直接用匿名类，作为Key 相当于 声明了2次，内存地址不一样，所以无法查找
		 */
		
		Map<Person1, String> map = new HashMap<Person1, String>();
		map.put(new Person1("张三",29), "至少三撒啊");
		
		/*
		 * map 用自定义类作为Key ，重写了 HashCode() equals() 方法，不通过内存地址进行识别 
		 */
		System.out.println(map.get(new Person1("张三",29)));
		
	}

}
