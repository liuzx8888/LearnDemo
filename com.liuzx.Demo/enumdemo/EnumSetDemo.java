package enumdemo;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public enum EnumSetDemo {
	篮球, 足球, 乒乓球;

	public static void main(String[] args) {
		/*
		 * 获取所有的枚举信息
		 */
		EnumSet<EnumSetDemo> boll = EnumSet.allOf(EnumSetDemo.class);
		Iterator<EnumSetDemo> iterator = boll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		/*
		 * 只设置一个枚举信息
		 */
		EnumSet<EnumSetDemo> boll1 = EnumSet.of(EnumSetDemo.篮球);
		Iterator<EnumSetDemo> iterator1 = boll1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		/*
		 * 指定枚举类型
		 */
		EnumSet<EnumSetDemo> boll2 = EnumSet.noneOf(EnumSetDemo.class);
		boll2.add(乒乓球);
		boll2.add(篮球);
		Iterator<EnumSetDemo> iterator2 = boll2.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
