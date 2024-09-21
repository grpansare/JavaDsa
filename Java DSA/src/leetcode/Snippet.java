package leetcode;



import java.util.*;

public class Snippet {
	   public static int nextGreaterElement(int n) {
		   
	        StringBuilder str=new StringBuilder(n+"");
	        str.reverse();
	        String s="accb";
	       
	        if(Integer.parseInt(str.toString())>n) {
	        	return Integer.parseInt(str.toString());
	        }
	        else {
	        	return -1;
	        }
	        
	    }
	   public int maximumRemovals(String s, String p, int[] removable) {
	        StringBuilder str=new StringBuilder(s);
	        int k=0;
	        for(int i=0;i<removable.length;i++) {
	        	for(int j=0;j<=i;j++) {
	        	if()
	        	}
	        	
	        }
	    }
	// Function to check if p is a subsequence of s after removing first k characters based on removable
	    private boolean isSubsequence(String s, String p, int[] removable, int k) {
	        // Create a boolean array to mark the characters in s that are removed
	        boolean[] removed = new boolean[s.length()];
	        for (int i = 0; i < k; i++) {
	            removed[removable[i]] = true;
	        }
	        
	        int j = 0;  // Pointer for string p
	        // Iterate through string s and try to match p
	        for (int i = 0; i < s.length(); i++) {
	            if (!removed[i] && s.charAt(i) == p.charAt(j)) {
	                j++;
	                if (j == p.length()) {
	                    return true;  // p is a subsequence of modified s
	                }
	            }
	        }
	        
	        return j == p.length();  // Check if we matched all of p
	    }

	   public static void main(String[] args) {
		System.out.println(nextGreaterElement(13));
	}
	  public int minCostToMoveChips(int[] position) {
	      position.
	        
	    }
}

