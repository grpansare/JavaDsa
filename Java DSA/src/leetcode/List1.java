package leetcode;
import java.util.Arrays;
import java.util.List;
class List1 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int size=image.length;
        int [][] result=new int[size][];
        for(int i=0;i<image.length;i++){
            int [] arr=new int[image[i].length];
         for(int j=image[i].length-1;j>=0;j--){
                for(int k=0;i<arr.length;i++){
                    arr[k]=image[i][j];
                }
        }
        result[i]=arr;
        }
        return result;
    }
    public static void main(String[] args) {
		int [][] arr= {{1,1,0},{1,0,1},{0,0,0}};
		int result[][]=flipAndInvertImage(arr);
		System.out.println(Arrays.toString(result));
	}
 }

