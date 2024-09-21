package BinarySearch;

public class MountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr []= {1,2,5,6,4,3,1};
    System.out.println(peakIndexInMountainArray(arr));
	}
	 public static int peakIndexInMountainArray(int[] arr) {
		 
				// TODO Auto-generated method stub
				int start=0;
				int end=arr.length-1;
				while(start <end) {
					int mid=start + (end-start)/2;
					if(arr[mid] > arr[mid+1]) {
						//you are in decreasing part of array
						//this may be anser but look at left
						end=mid;
					}
					else if(arr[mid] < arr[mid+1]) {
//						you are in ascending part of array
						
						start=mid+1;
					}
				}
//				in the end ,start == end and pointing to the largest number because of 2 checks above
				return start; // or end as both are equal;
			}
	        
	  }


