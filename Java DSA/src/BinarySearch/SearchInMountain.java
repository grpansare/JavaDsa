package BinarySearch;

public class SearchInMountain {
public static void main(String[] args) {
	 int arr []= {1,2,5,6,4,3,1};
	  
	   
	   
		}

int search(int [] arr,int target) {
	 int peak=peakIndexInMountainArray(arr);
	 int firstTry=binarySearch(arr,target,0,peak);
	 if(firstTry != -1) {
		 return firstTry;
	 }
	 return binarySearch(arr,target,peak+1,arr.length-1);
	 //try search in second half
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
//							you are in ascending part of array
							
							start=mid+1;
						}
					}
//					in the end ,start == end and pointing to the largest number because of 2 checks above
					return start; // or end as both are equal;
				}
		 
		 
		 private static int binarySearch(int[] arr, int target,int start,int end) {
				// TODO Auto-generated method stub
				
				
				boolean isAsc=arr[start]<arr[end];
				
				while(start <=end) {
					int mid=start + (end-start)/2;
					if(target == arr[mid]) {
						return mid;
					}
					else if(isAsc) {
						if(target < arr[mid]) {
							end=mid-1;
						}
						else if(target > arr[mid]) {
							start=mid+1;
						}
					}
					else {
						if(target > arr[mid]) {
							end=mid-1;
						}
						else if(target < arr[mid]) {
							start=mid+1;
						}
					}
				}
				return -1;
			}
}

