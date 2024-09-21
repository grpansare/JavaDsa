package day2;

public class LinearSearch {
public static void main(String[] args) {
	int[] nums= {1,89,67,45,76};
	int target=89;
	int ans=linearSearch2(nums,target);
	System.out.println(ans);
}
//search in array
//return index if item found
static int linearSearch(int []arr,int target) {
	if(arr.length == 0) {
		return -1;
	}
	for(int ind=0;ind<arr.length;ind++) {
		int element=arr[ind];
		if(element == target) {
			return ind;
		}
	}
	//element not found
	return -1;
	
}
static int linearSearch2(int []arr,int target) {
	if(arr.length == 0) {
		return -1;
	}
	for(int element:arr) {
		if(element == target) {
			return element;
		}
	}
	//element not found
	return -1;
	
}
static boolean linearSearch3(int []arr,int target) {
	if(arr.length == 0) {
		return false;
	}
	for(int ind=0;ind<arr.length;ind++) {
		int element=arr[ind];
		if(element == target) {
			return true;
		}
	}
	//element not found
	return false;
	
}
}
