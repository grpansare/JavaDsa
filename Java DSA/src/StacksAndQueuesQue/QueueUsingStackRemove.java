package StacksAndQueuesQue;

import java.util.Stack;

public class QueueUsingStackRemove {
	
	
	private Stack<Integer> first;
	private Stack<Integer> second;
	
	public QueueUsingStackRemove() {
		this.first=new Stack<>();
		this.second=new Stack<>();
	}
	
	public void push(int item) {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		first.push(item);
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
	}
	
	public int remove() {
		return first.pop();
	}
	public boolean isEmpty() {
		return first.isEmpty();	}
	
	public int peek() {
		return first.peek();
	}
	

}
