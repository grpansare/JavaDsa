package ArrayRecursion;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,8,5};
		System.out.println(isSort(arr,0));

	}
	static boolean isSort(int [] arr,int index) {
		if(index == arr.length-1) {
			return true;
		}
		return arr[index] < arr[index+1] && isSort(arr,index+1);
	}

}
