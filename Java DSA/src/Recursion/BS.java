package Recursion;

public class BS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] arr= {1,2,3,5,6};
	System.out.println(search(arr,4));
	}
	 public static int search(int[] nums, int target) {
         return find(nums, target,0,nums.length-1);
    }
	 static int find(int [] nums,int target,int s,int e) {
		 if(s>e) {
			 return -1;
		 }
		 int m=s+(e-s)/2;
		 if(nums[m] == target) {
			 return m; 
		 }
		 if(nums[m] > target) {
			 return find(nums,target,s,m-1);
		 }
		 else {
			 return find(nums,target,m+1,e);
		 }
	 }

}
