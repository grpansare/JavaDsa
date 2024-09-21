package leetcode;

import java.util.Arrays;

class Rev {
	public static void main(String[] args) {
		char [] s= {'h','e','l','l','0'};
		reverseString(s);
	}
    public static void reverseString(char[] s) {
        reverse(s,0,s.length-1);
        System.out.println(Arrays.toString(s));
    }
    public static void reverse(char [] str,int s,int e){
        if(s>e){
            return;
        }
        char temp=str[s];
        str[s]=str[e];
        str[e]=temp;
        reverse(str,s+1,e-1);
    }
}