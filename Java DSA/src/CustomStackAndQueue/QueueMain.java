package CustomStackAndQueue;

public class QueueMain {

	public static void main(String[] args) throws StackException {
		// TODO Auto-generated method stub
//        CustomQueue queue=new CustomQueue(5);
//        queue.insert(10);
//        queue.insert(11);
//        queue.insert(12);
//        queue.insert(13);
//        queue.insert(114);
//        queue.display();
//        queue.remove();
//        queue.display();
		  CircularQueue queue=new CircularQueue(5);
	        queue.insert(10);
	        queue.insert(11);
	        queue.insert(12);
	        queue.insert(13);
	        queue.insert(114);
	        queue.display();
	        queue.remove();
	        queue.display();
	}

}
