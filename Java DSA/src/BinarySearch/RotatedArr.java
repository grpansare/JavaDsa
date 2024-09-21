package BinarySearch;


//arr=[1,2,3,4,5,6,8,10,12]
// after one rotation -> [12,1,2,3,4,5,6,8,10]
//after 2nd rotation -> [10,12,1,2,3,4,5,6,8]
//after 3rd rotaion -> [8,10,12,1,2,3,4,5,6]

//find pivot
//search in first half
//seach in second half
public class RotatedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {6,7,1,2,3,4,5};
		System.out.println(findPivot(arr));

	}
	  public static int search(int[] nums, int target) {
	       int pivot=findPivot(nums);
	       //if you did not found pivote this means array is not rotated
	       if(pivot == -1) {
	    	   //just do normal binary search
	    	   return binarySearch(nums, target, 0, nums.length-1);
	       }
	       //if pivote is found you found 2 asc sorted arrays
	       if(nums[pivot] == target) {
	    	   return pivot;
	       }
	       if(target >= nums[0]) {
	    	   return binarySearch(nums, target, 0, pivot-1);
	       }
	       return binarySearch(nums, target, pivot+1, nums.length-1);
	       
	    }
	  
	  private static int binarySearch(int[] arr, int target,int start,int end) {
			// TODO Auto-generated method stub
		
			while(start <=end) {
				int mid=start + (end-start)/2;
				if(target < arr[mid]) {
					end=mid-1;
				}
				else if(target > arr[mid]) {
					start=mid+1;
				}else {
					return mid;
				}
			}
			return -1;
		}
	static int findPivot(int [] arr) {
		int start=0;
		int end=arr.length-1;
		while(start <= end) {
			int mid=start + (end-start)/2;
			// 4 cases over here
			if(mid <end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid] <= arr[start]) {
				end=mid-1;
			}
			else {
				start=mid+1;
		}
	}
	return -1;
	}

}
