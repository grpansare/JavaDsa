package BinarySearch;

public class FloorNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,5,9,14,16,18};
		int target=15;
		System.out.println(Floor(arr, target));
	}
	//greatest no smaller than equal to target
	private static int Floor(int[] arr, int target) {
		// TODO Auto-generated method stub
		int start=0;
		int end=arr.length-1;
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
		return end;
	}

}
