package day2;

import java.util.Arrays;

public class Search2d {
   public static void main(String[] args) {
	   int [][] arr=
				{
						{1,2,4},
						{2,3,4},
						{46,9}
				};
	   int target=2;
	   int [] ans=search(arr,target);
	   System.out.println(Arrays.toString(ans));
	   System.out.println(max(arr));
}
   static int [] search(int [][] arr,int target) {
	   for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]== target) {
					return new int[] { row,col};
				
			}
		}
   }
	   return new int[] {-1,-1};
   }
   static int max(int [][] arr) {
	   int max=arr[0][0];
	   for(int [] ints :arr) {
		   for(int no:ints) {
			   if(no>max) {
				   max=no;
			   }
		   }
	   }
	   return max;
   }
}
