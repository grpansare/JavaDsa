package CustomStackAndQueue;

public class DynamicStack extends Stack{
	public DynamicStack() {
		super();
	}
	
	public DynamicStack(int size) {
		super(size);
	}

	@Override
	public boolean push(int n) {
		
		
	if(this.isFull()) {
		int [] temp=new int[data.length*2];
		for(int i=0;i<data.length;i++) {
			temp[i]=data[i];
			
		}
		data=temp;
	}
	
	//insert item
		return super.push(n);
	}
	

}
