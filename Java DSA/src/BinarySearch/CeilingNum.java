package BinarySearch;

public class CeilingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,5,9,14,16,18};
		int target=15;
		System.out.println(Ceiling(arr, target));
	}
	//smallest no greater than eqaul to target
	private static int Ceiling(int[] arr, int target) {
		if(target > arr[arr.length-1]) {
			return -1;
		}
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
		return start;
	}

}
