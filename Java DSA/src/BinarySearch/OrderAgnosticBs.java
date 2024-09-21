package BinarySearch;

public class OrderAgnosticBs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//			int [] arr= {-18,-17,-10,0,1,4,5,45,64,89,100};
			int [] arr= {90,89,66,55,45,35,25,15,5};
		int target=45;
			int ans=binarySearch(arr,target);
			System.out.println(ans);
			
	}
	private static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int start=0;
		int end=arr.length-1;
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
