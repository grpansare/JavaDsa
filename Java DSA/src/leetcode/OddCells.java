package leetcode;

import java.util.Arrays;

public class OddCells {
	
	public static void main(String[] args) {
		int [][] indices= {{0,1},{1,1}};
		System.out.println(oddCell(2,3,indices));
	}
	 public static int oddCell(int m, int n, int[][] indices) {
	        int [][] matrix=new int[m][n];
	        int odds=0;
	        for(int [] arr:indices){
	              int r=arr[0];
	              int col=arr[1];
	              for(int i=0;i<n;i++){
	                matrix[r][i]+=1;

	              }
	              for(int i=0;i<m;i++){
	                matrix[i][col]+=1;
	              }
	              
	              System.out.println(Arrays.toString(matrix[0]));
	              System.out.println(Arrays.toString(matrix[1]));
 
	        }
	        for(int [] row:matrix){
                for(int i: row){
                    if(i % 2 != 0){
                        odds++;
                    }
                }
              }
	        
	        return odds;
	    }
}

