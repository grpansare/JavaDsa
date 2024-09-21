package leetcode;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {4,0,2,1};
      
       missingNumber(arr);
       System.out.println(Arrays.toString(arr));
       
	}
	
	static int missingNumber(int [] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i];
			if(arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
		}
		
		//search for missing number
		for(int index=0;index<arr.length;i++) {
			if(arr[index] != index) {
				return index;
			}
		}
		return arr.length;
	}
	public static void swap(int [] arr,int first,int end) {
		int temp=arr[first];
		arr[first]=arr[end];
		arr[end]=temp;;
		
	}

}
