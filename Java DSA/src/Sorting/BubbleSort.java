package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,4,5,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.binarySearch(arr, ));

	}
	public static void bubbleSort(int [] arr) {
		boolean swapped;
		for(int i=0;i < arr.length-1;i++) {
			 swapped=false;
			 for(int j=1;j < arr.length - i;j++) {
				 if(arr[j] < arr[j-1]) {
					 int temp=arr[j];
					 arr[j]=arr[j-1];
					 arr[j-1]=temp;
					 swapped=true;
				 }
			 }
			 if(!swapped) {
				break;
			 }
		}
	}

}
