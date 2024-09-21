package BinarySearch;

public class NumberOfRotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {6,7,1,2,3,4,5};
		
		System.out.println("number of rotaion "+countRotations(arr));

	}
	static int countRotations(int []arr) {
		int pivot=findPivot(arr);
		if(pivot == -1) {
			//array is not rotated
			return 0;
		}
		return pivot + 1;
	}
	static int findPivot(int [] nums) {
//		int start=0;
//		int end=arr.length-1;
//		while(start <= end) {
//			int mid=start + (end-start)/2;
//			// 4 cases over here
//			if(mid <end && arr[mid]>arr[mid+1]) {
//				return mid;
//			}
//			if(mid>start && arr[mid]<arr[mid-1]) {
//				return mid-1;
//			}
//			if(arr[mid] <= arr[start]) {
//				end=mid-1;
//			}
//			else {
//				start=mid+1;
//		}
//	}
//	return -1;
	
	int low=0;
    int hi=nums.length-1;
    int ans=0;
    while(low<=hi) {
    	int mid=(low+hi)/2;
    	if(nums[low]< nums[hi]) {
    		ans=nums[hi] > ans?hi:ans;
    		break;
    	}
    	if(nums[mid] >= nums[low] ){
    		ans=nums[mid] > ans?mid:ans;
    		low=mid+1;
    	}
    	else {
    		ans=nums[hi] > ans?hi:ans;
    		hi=mid-1;
    	}
    }
    return ans;
}
	

}
