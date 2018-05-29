package CollectionDemo;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		sortedSet.add("张三");
		sortedSet.add("男");
		sortedSet.add("30");
		sortedSet.add("李四");
		sortedSet.add("男");
		sortedSet.add("22");

		/*
		 * System.out.println(sortedSet); 
		 * System.out.println(sortedSet.first()); 第一个元素
		 * System.out.println(sortedSet.last());  最后一个元素
		 * System.out.println(sortedSet.headSet("男")); 指定元素之前的内容
		 * System.out.println(sortedSet.tailSet("李四")); 指定元素之后的内容
		 * System.out.println(sortedSet.subSet("22", "李四"));指定范围内的内容
		 */
		 /*
		  * 删除指定内容
		  */
        String str = null;
		Iterator<String> iterator = sortedSet.iterator();
		while (iterator.hasNext()) {
			str = iterator.next();
			if ("男".equals(str)) {
				iterator.remove();	
			}
			System.out.println(sortedSet);
		}

	}

}
