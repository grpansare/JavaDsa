package day1;

import java.security.DomainCombiner;
import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
  public static void main(String[] args) {
	  //row is compulsory
	Scanner in=new Scanner(System.in);
//	int [][] arr=new int[3][];
//	int [][] arr=
//		{
//				{1,2,4},
//				{2,3,4},
//				{46,9}
//		};
	int [][]arr=new int[3][2];
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			arr[row][col]=in.nextInt();
		}
	}
//	System.out.println(Arrays.toString(arr));
//	for(int row=0;row<arr.length;row++) {
//		for(int col=0;col<arr[row].length;col++) {
//			System.out.print(arr[row][col] +" ");
//		}
//		System.out.println();
//	}
//	for(int row=0;row<arr.length;row++) {
//		System.out.println(Arrays.toString(arr[row]));
//	}
	for(int [] a:arr) {
		System.out.println(Arrays.toString(a));
	}
}
}
