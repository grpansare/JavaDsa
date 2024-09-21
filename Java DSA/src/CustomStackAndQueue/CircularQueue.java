package CustomStackAndQueue;

public class CircularQueue {
	protected int [] data;
	private static final int DEFAULT_SIZE=10;
	
	int end=0;
	int front=0;
	int size=0;
	public CircularQueue() {
		this(DEFAULT_SIZE);
	}
	public CircularQueue(int size) {
		this.data=new int[size];
	}
	public boolean isFull() {
		return size==data.length-1;
	}
	
	private boolean isEmpty() {
		return size==0;
	}
	public boolean insert(int n) {
		if(isFull()) {
			return false;
		}
		data[end++]=n;
		end=end%data.length;
		size++;
		return true;
		
	}
	public int remove() throws StackException{
		if(isEmpty()) {
			throw new StackException("Queue is empty");
		}
		int removed=data[front++];
		front=front%data.length;
		
		size--;
		return removed;
	}
	public int front() throws  StackException{
		if(isEmpty()) {
			throw new StackException("Queue is empty");
		}
		return data[front];
	}
	 public void display() {
	        if (isEmpty()) {
	            System.out.println("Empty");
	            return;
	        }
	        int i = front;
	        do {
	            System.out.print(data[i] + " -> ");
	            i++;
	            i %= data.length;
	        } while (i != end);
	        System.out.println("END");
	    }

	
	
}
