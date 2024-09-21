package StacksAndQueuesQue;

import java.util.Stack;

public class QueueUsingStack {
	
	
	private Stack<Integer> first;
	private Stack<Integer> second;
	
	public QueueUsingStack() {
		this.first=new Stack<>();
		this.second=new Stack<>();
	}
	
	public void push(int item) {
		first.push(item);
	}
	
	public int remove() {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		int removed=second.pop();
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		return removed;
	}
	public boolean isEmpty() {
		return first.isEmpty();	}
	
	public int peek() {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		int peek=second.peek();
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		return peek;
	}
	

}
