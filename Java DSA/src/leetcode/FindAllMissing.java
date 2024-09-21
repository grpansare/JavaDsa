package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
	
	public static void main(String[] args) {
		int [] arr= {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(arr));
	}
	  public static List<Integer> findDisappearedNumbers(int[] nums) {
		  int i=0;
			while(i<nums.length) {
				int correct=nums[i]-1;
				if( nums[i] != nums[correct]) {
					swap(nums,i,correct);
				}
				else {
					i++;
				}
			}
			
			//search for missing number
			List<Integer> list=new ArrayList<>();
			for(int index=0;index<nums.length;index++) {
				if(nums[index] != index+1) {
					list.add(index+1);
				}
			}
			return list;
	    }

		
		public static void swap(int [] arr,int first,int end) {
			int temp=arr[first];
			arr[first]=arr[end];
			arr[end]=temp;;
			
		}
}

