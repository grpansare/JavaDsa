package BinarySearch;

public class InfiniteArray {

	public static void main(String[] args) {
	
		int [] arr= {3,5,7,9,10,90,100,130,140,160,170};
		int target=10;
		System.err.println(ans(arr,target));

	}
	static int ans(int [] arr,int target) {
		//first find the range
		//start with box of 2
		int start=0;
		int end=1;
		while(target >arr[end]) {
			int newStart=end+1;
			//double the box value
			//end=previoues end + sizeofbox*2
			end=end+(end-start + 1) *2;
			start=newStart;
		}
		return binarySearch(arr,target,start,end);
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

}
