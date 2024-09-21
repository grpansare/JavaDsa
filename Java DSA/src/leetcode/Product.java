package leetcode;

import java.util.Arrays;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(arr)));

	}
	  public static int[] productExceptSelf(int[] nums) {
		  int n = nums.length;
		         int[] result = new int[n];
		         
		         // Step 1: Calculate the left products
		         result[0] = 1;
		         for (int i = 1; i < n; i++) {
		             result[i] = result[i - 1] * nums[i - 1];
		         }
		         System.out.println(Arrays.toString(result));

		         // Step 2: Calculate the right products and the result array
		         int rightProduct = 1;
		         for (int i = n - 1; i >= 0; i--) {
		             result[i] = result[i] * rightProduct;
		             rightProduct *= nums[i];
		         }
		         
		         return result;
		     }

}
