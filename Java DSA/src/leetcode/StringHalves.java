package leetcode;

import java.util.Arrays;

public class StringHalves {
	public static boolean halvesAreAlike(String s) {
	        String vowels="aeiouAEIOU";
	        int size=s.length();
	        String [] a=s.split("",2);
	        System.out.println(Arrays.toString(a));
//	        int mid=s.length()/2;
//	        int firstHalf=0;
//	        int secondHalf=0;
//	        for(int i=0;i<mid;i++){
//	        	char ch=s.charAt(i);
//	            if(vowels.contains(ch)){
//	                firstHalf++;
//	            } 
//	            if(vowels.contains(s.charAt(size-i-1))){
//	               secondHalf++;
//	            }
//	        }
//	        if(firstHalf == secondHalf){
//	            return true;
//	        }
	        return false;
	    }
	public static void main(String[] args) {
		halvesAreAlike("book");
	}
}

