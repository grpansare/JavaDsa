package CustomStackAndQueue;

public class DynamicCircularQueue extends CircularQueue{
   public DynamicCircularQueue() {
	   super();
   }
   public DynamicCircularQueue(int size) {
	   super(size);
   }
@Override
public boolean insert(int n) {
	if(isFull()) {
		int [] temp=new int[data.length*2];
		for(int i=0;i<data.length;i++) {
			temp[i]=data[(front+i) % data.length];
		}
		int front=0;
		int end=data.length;
		data=temp;
	}
	return super.insert(n);
}
   
}
