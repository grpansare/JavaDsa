package Sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		int [] arr= {3,5,2,1,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void sort(int [] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;//corrent index of number index=3-1=2 arr[2]=3
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
		}
	}
	public static void swap(int [] arr,int first,int end) {
		int temp=arr[first];
		arr[first]=arr[end];
		arr[end]=temp;;
		
	}

}
