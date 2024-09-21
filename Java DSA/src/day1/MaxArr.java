package day1;

public class MaxArr {
	public static void main(String[] args) {
		int [] arr= {2,3,4,5,6};
	System.out.println(	max(arr));
	}
  static int max(int [] arr) {
	  int maxValue=arr[0];
	  for(int i=1;i<arr.length;i++) {
		  if(maxValue<arr[i]) {
			  maxValue=arr[i];
		  }
	  }
	  return maxValue;
  }
}
