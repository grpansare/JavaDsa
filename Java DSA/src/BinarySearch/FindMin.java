package BinarySearch;
class FindMin {
    public static int findMin(int[] nums) {
        int low=0;
        int hi=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=hi) {
        	int mid=(low+hi)/2;
        	if(nums[low]< nums[hi]) {
        		ans=nums[low] < ans?nums[low]:ans;
        		break;
        	}
        	if(nums[mid] > nums[low] ){
        		ans=nums[low] < ans?nums[low]:ans;
        		low=mid+1;
        	}
        	else {
        		ans=nums[mid] < ans?nums[mid]:ans;
        		low=mid+1;
        	}
        }
        return ans;
    }
    public static void main(String[] args) {
		int [] arr= {4,5,1,2,3};
		System.out.println(findMin(arr));
	}
}