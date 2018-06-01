package enumdemo;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public enum EnumSetDemo {
	����, ����, ƹ����;

	public static void main(String[] args) {
		/*
		 * ��ȡ���е�ö����Ϣ
		 */
		EnumSet<EnumSetDemo> boll = EnumSet.allOf(EnumSetDemo.class);
		Iterator<EnumSetDemo> iterator = boll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		/*
		 * ֻ����һ��ö����Ϣ
		 */
		EnumSet<EnumSetDemo> boll1 = EnumSet.of(EnumSetDemo.����);
		Iterator<EnumSetDemo> iterator1 = boll1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		/*
		 * ָ��ö������
		 */
		EnumSet<EnumSetDemo> boll2 = EnumSet.noneOf(EnumSetDemo.class);
		boll2.add(ƹ����);
		boll2.add(����);
		Iterator<EnumSetDemo> iterator2 = boll2.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
