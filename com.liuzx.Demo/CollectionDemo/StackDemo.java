package CollectionDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		/*
		 * 后进先出
		 */
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("A");
		stack.add("B");
		stack.add("C");
		stack.add("D");
		stack.add("A");
		System.out.println(stack);
		Stack<String> stack1 = new Stack<String>();
		System.out.println( stack1.push("AA"));
		System.out.println( stack1.push("BB"));
		System.out.println( stack1.push("CC"));
		System.out.println( stack1.push("DD"));
		System.out.println( stack1.pop());
		System.out.println( stack1.pop());	
		System.out.println( stack1.pop());	
		System.out.println( stack1.pop());	
	}

}
