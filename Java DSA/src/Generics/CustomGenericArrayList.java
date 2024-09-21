package Generics;

import java.util.Arrays;

public class CustomGenericArrayList <T> {
	private Object [] data;
	private static int DEAFAULT_SIZE=10;
	private int size=0;

	    public CustomGenericArrayList() {
			 data=new Object[DEAFAULT_SIZE];
		}
	    public void add(T n) {
	    	if(isFull()) {
	    		resize();
	    	}
	    	data[size++]=n;
	    }
	    
	    private void resize() {
			Object [] temp=new Object[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			data=temp;
		}
	    public void set(int index,T value) {
	    	data[index]=value;
	    }
	    public T remove() {
	    	T removed=(T)(data[--size]);
	    	return removed;
	    }
	    public int size() {
	    	return size;
	    }
	    
		@Override
		public String toString() {
			return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
		}
		private boolean isFull() {
			// TODO Auto-generated method stub
			return size==data.length;
		}
		public T get(int index) {
	    	return (T)data[index];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomGenericArrayList<Integer> list=new CustomGenericArrayList();
		
		list.add(3);
		System.out.println(list);
            
	}

}
