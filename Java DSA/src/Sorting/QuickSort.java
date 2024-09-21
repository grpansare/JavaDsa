package Sorting;

import java.util.Arrays;

public class QuickSort {
   static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {3,1,2,4,5};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        System.out.println(count);
//        Arrays.sort(arr);
	} 
	static void sort(int [] nums,int low,int hi) {
		
		if(low >= hi) {
			
			return;
		}
	
		int s=low;
		int e=hi;
		int m=s+(e-s)/2;
		int pivot=nums[m];
		System.out.println(s+" "+e);
		
		
		while(s<=e) {
//			also a reason why if its alredady sorted it will not swap
			while(nums[s] < pivot) {
				s++;
				
			}
			while(nums[e]>pivot) {
				e--;
				
			}
			if(s<=e) {
			
				int temp=nums[s];
				nums[s]=nums[e];
				nums[e]=temp;
				 System.out.println(Arrays.toString(nums));
				s++;
				e--;
			}
			
//			System.out.println(s+" "+e+" "+m+" "+pivot);
//			System.out.println(Arrays.toString(nums));
		}
		
		//now my pivot is at correct index please sort two halves now
//		count++;
		sort(nums,low,e);
		sort(nums,s,hi);
	}

}
