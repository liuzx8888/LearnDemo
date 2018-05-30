package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ArraryListDemo {
	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<String>();
		Collection<String> collection = new ArrayList<String>();
		arrlist.add("张三");
		arrlist.add("男");
		arrlist.add("30");
		System.out.println(arrlist);
		for (String arrlist1 : arrlist) {
			System.out.println(arrlist1);
		}
		/*添加内容*/
		collection.add("李四");
		collection.add("男");
		collection.add("38");
		/*添加一组内容*/
		arrlist.addAll(collection);
		System.out.println(arrlist);
		/*转换成数组*/
		String str[]  = new String[] {};  
		str= arrlist.toArray(str);
		for (int i = 0; i < str.length ;i++) {
			System.out.println(str[i]);
		}
		/*移除内容*/
		arrlist.remove(0);
		arrlist.remove("李四");
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}

		System.out.println(arrlist);
		/*移除一组内容*/
		arrlist.removeAll(collection);
		System.out.println(arrlist);
		/*截取部分内容*/
		System.out.println(arrlist.subList(0, 1));
	}

}
