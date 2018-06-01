package enumdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public enum EnumCompareTo {
	RED, BLUE, YELLOW;

	public static void main(String[] args) {
		Set<EnumCompareTo> EnumCompareTo = new TreeSet<EnumCompareTo>();
		EnumCompareTo.add(BLUE);
		EnumCompareTo.add(YELLOW);
		EnumCompareTo.add(RED);
		Iterator<EnumCompareTo> iterator = EnumCompareTo.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
