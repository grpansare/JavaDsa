package Generics;

import java.util.Arrays;

public class CustomArrayList {
	
	private int [] data;
private static int DEAFAULT_SIZE=10;
private int size=0;

    public CustomArrayList() {
		 data=new int[DEAFAULT_SIZE];
	}
    public void add(int n) {
    	if(isFull()) {
    		resize();
    	}
    	data[size++]=n;
    }
    
    private void resize() {
		int [] temp=new int[data.length*2];
		for(int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		data=temp;
	}
    public void set(int index,int value) {
    	data[index]=value;
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
	public int get(int index) {
    	return data[index];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CustomArrayList list=new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(20);
        System.out.println(list);
	}

}
