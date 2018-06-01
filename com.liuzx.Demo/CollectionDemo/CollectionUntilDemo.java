package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUntilDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String arr[] = new String[] { "张三", "男", "29", "李四", "女", "28" };
		/*
		 * 一次性增加多条内容
		 */
		Collections.addAll(list, arr);
		System.out.println(list);
		/*
		 * 检索功能
		 */
		System.out.println(Collections.binarySearch(list, "29"));
		/*
		 * 整体替换
		 */
		Collections.replaceAll(list, "张三", "张三3");
		System.out.println(list);

		/*
		 * 排序
		 */
		Collections.sort(list);
		System.out.println(list);

		/*
		 * 交换位置
		 */
		Collections.swap(list, 4, 5);
		System.out.println(list);
	}

}
