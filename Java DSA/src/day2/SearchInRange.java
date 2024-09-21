package day2;

public class SearchInRange {
	
	public static void main(String[] args) {
		int[] nums= {1,89,67,45,76};
		int target=89;
		int ans=linearSearch(nums,target,1,4);
		System.out.println(ans);
	}
	static int linearSearch(int []arr,int target,int start,int end) {
		if(arr.length == 0) {
			return -1;
		}
		for(int ind=start;ind<=end;ind++) {
			int element=arr[ind];
			if(element == target) {
				return ind;
			}
		}
		//element not found
		return -1;
		
	}
}
