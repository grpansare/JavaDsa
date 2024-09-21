package day2;

public class MinValue {
	public static void main(String[] args) {
		int [] arr= {8,7,3,2,14};
		System.out.println(min(arr));
	}
	
	static int min(int [] arr) {
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<ans) {
				ans=arr[i];
			}
		}
		
		return ans;
	}

}
