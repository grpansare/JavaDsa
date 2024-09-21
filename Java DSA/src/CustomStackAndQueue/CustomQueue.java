package CustomStackAndQueue;

public class CustomQueue {
	protected int [] data;
	private static final int DEFAULT_SIZE=10;
	int end=0;
	public CustomQueue() {
		this(DEFAULT_SIZE);
	}
	public CustomQueue(int size) {
		this.data=new int[size];
	}
	public boolean isFull() {
		return end==data.length-1;
	}
	
	private boolean isEmpty() {
		return end==0;
	}
	
	public boolean insert(int n) {
		if(isFull()) {
			return false;
		}
		data[end++]=n;
		return true;
	}
	public int remove() throws StackException{
		if(isEmpty()) {
			throw new StackException("Queue is empty");
		}
		int removed=data[0];
		for(int i=1;i<end;i++) {
			data[i-1]=data[i];
		}
		end--;
		return removed;
	}
	
	public int front() throws  StackException{
		if(isEmpty()) {
			throw new StackException("Queue is empty");
		}
		return data[0];
	}
	public void display() {
		for(int i=0;i<end;i++) {
			System.out.println(data[i]+" -> ");
		}
		System.out.println("END");
	}
}
