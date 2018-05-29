package CollectionDemo;
import java.util.ArrayList;

public class ListIterator {
	public static void main(String[] args) {
		ArrayList<String> sortedSet = new ArrayList<String> ();
		sortedSet.add("张三");
		sortedSet.add("男");
		sortedSet.add("30");
		sortedSet.add("李四");
		sortedSet.add("男");
		sortedSet.add("22");
		sortedSet.set(0, "张三三");
		java.util.ListIterator<String> iterator = sortedSet.listIterator();
		while(iterator.hasNext()) {
			System.out.println("从前往后："+iterator.next());
		}
		while(iterator.hasPrevious()) {
			System.out.println("从后往前："+iterator.previous());	
		}
		
		
	}

}
