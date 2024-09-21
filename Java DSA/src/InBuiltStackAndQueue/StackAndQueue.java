package InBuiltStackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {

	public static void main(String[] args) {
//		Stack<Integer> stack=new Stack<>();
//		stack.push(23);
//		stack.push(25);
//		stack.push(30);
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
//		Queue<Integer> que=new LinkedList<>();
//		que.add(12);
//		que.add(23);
//		que.add(34);
//		que.add(36);
//		System.out.println(que.remove());
//		System.out.println(que.remove());
		
		
		Deque<Integer> dq=new ArrayDeque<>();
		dq.add(5);
		dq.addLast(34);
		dq.removeFirst();
		dq.removeLast();
		
		

	}

}
