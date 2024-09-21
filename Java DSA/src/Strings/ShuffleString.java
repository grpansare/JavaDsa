package Strings;

import java.util.Arrays;

public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//				Output: "leetcode"
//				Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
		String s="codeleet";
		int [] indices= {4,5,6,7,0,2,1,3};
		String ans="";
		char[] chars=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int index=indices[i];
			chars[index]=s.charAt(i);
			
		}
		for(int i=0;i<chars.length;i++) {
			ans+=chars[i];
			
		}
		System.out.println(ans);
		
		
     System.out.println(Arrays.toString(chars));
	}

}
