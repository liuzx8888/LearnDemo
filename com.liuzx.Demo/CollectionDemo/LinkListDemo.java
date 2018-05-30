package CollectionDemo;

import java.util.LinkedList;

public class LinkListDemo {
	public static void main(String[] args) {
		LinkedList<String>  List1 = new LinkedList<String>();
		List1.add("张三");
		List1.add("男");
		List1.add("29");
		List1.add("李四");
		List1.add("男");
		List1.add("35");		
		System.out.println(List1);
		System.out.println(List1.element());
		System.out.println(List1.getLast());
		System.out.println(List1.peek());
		System.out.println(List1);
		System.out.println(List1.poll());	
		System.out.println(List1);
		System.out.println(List1.peekFirst());
		System.out.println(List1);
		System.out.println(List1.peekLast());
		System.out.println(List1);
		/**  先进先出*/
		
		LinkedList<String>  List2 = new LinkedList<String>();
		List2.add("张三");
		List2.add("男");
		List2.add("29");
		List2.add("李四");
		List2.add("男");
		List2.add("35");
		List2.addFirst("Begin");
		List2.addLast("End");
		System.out.println(List2.size());
		for(int i =0 ; i<List2.size()+1;i++) {
			System.out.println(i+List2.poll());	
		}
		
	}

}
