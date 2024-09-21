package BinarySearch;

public class CelingChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr= {'c','f','j'};
		int target=15;
		System.out.println(Ceiling(arr, target));
	}
	//smallest no greater than eqaul to target
	private static char Ceiling(char[] letter, int target) {
		
		// TODO Auto-generated method stub
		int start=0;
		int end=letter.length-1;
		while(start <=end) {
			int mid=start + (end-start)/2;
			if(target < letter[mid]) {
				end=mid-1;
			}
			else  {
				start=mid+1;
			}
		}
		return letter[start%letter.length];
	}
}
