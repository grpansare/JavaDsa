package Sorting;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int [] arr= {2,4,5,1,3};
	selection(arr);
	System.out.println(Arrays.toString(arr));
}
public static void selection(int [] arr) {
	for(int i=0;i<arr.length;i++) {
		int last=arr.length-i-1;
		int maxIndex=giveMaxIndex(arr,0,last);
		swap(arr,maxIndex,last);
	}
	
}
public static int giveMaxIndex(int[] arr, int start, int end) {
	// TODO Auto-generated method stub
	int max=start;
	for(int i=start;i<=end;i++) {
		if(arr[i] > arr[max]) {
			max=i;
		}
	}
	return max;
}
public static void swap(int [] arr,int first,int end) {
	int temp=arr[first];
	arr[first]=arr[end];
	arr[end]=temp;;
	
}
}
