package Sorting;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {0,-32,3,1};
       insertion(arr);
       System.out.println(Arrays.toString(arr));
       
	}
	public static void insertion(int [] arr){
	for(int i=0;i<arr.length-1;i++){
		for(int j=i+1;j>0;j--) {
			if(arr[j] < arr[j-1]) {
				swap(arr,j,j-1);
			}
			else {
				break;
			}
		}
	}
			
		
	}
	public static void swap(int [] arr,int first,int end) {
		int temp=arr[first];
		arr[first]=arr[end];
		arr[end]=temp;;
		
	}
	

}
