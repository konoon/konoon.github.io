package source15.collection;

import java.util.Stack;

public class Test02_Stack {
	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<String>();
		stack1.push("사과");
		stack1.push("바나나");
		stack1.push("체리");
		
		System.out.println("[Stack LIFO 후입선출]");
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println("===========");
		
		Stack<Integer> stack2 = new Stack<Integer>() ;
		stack2.add(10);
		stack2.add(20);
		stack2.add(1, 100);
		
		for (int integer : stack2) {
			System.out.println(integer + " ");
		}
	}
}
