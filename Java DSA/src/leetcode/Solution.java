package leetcode;
//class Solution {
//     public static   boolean checkPalindromeFormation(String a, String b) {
//       for(int i=0;i<a.length();i++) {
//    	   if(isPalindrome(a.substring(0,i)+b.substring(i))|| isPalindrome(b.substring(0,i)+a.substring(i)) ) {
//    		   return false;
//    	   }
//       }
//    }
//
//   
//
//   
//    public static void main(String[] args) {
//    	checkPalindromeFormation("ulacfd","jizalu");  
//	}
//}

public class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0;
        int right = removable.length;
        
        // Binary search for the maximum k
        while (left < right) {
            int mid = (left + right + 1) / 2;
            
            // If p is still a subsequence after removing mid characters, increase k
            if (isSubsequence(s, p, removable, mid)) {
                left = mid;  // We can try removing more characters
            } else {
                right = mid - 1;  // We need to remove fewer characters
            }
        }
        
        return left;
    }

    // Function to check if p is a subsequence of s after removing first k characters based on removable
    private boolean isSubsequence(String s, String p, int[] removable, int k) {
        // Create a boolean array to mark the characters in s that are removed
    	System.out.println(k);
        boolean[] removed = new boolean[s.length()];
        for (int i = 0; i < k; i++) {
            removed[removable[i]] = true;
        }
        
       int j=0;
       for(int i=0;i<s.length();i++) {
    	   if(!removed[i] && s.charAt(i) == p.charAt(j)) {
    		   j++;
    		   if(j==p.length()) {
    			   return true;
    		   }
    	   }
       }
        return j == p.length();  // Check if we matched all of p
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("answer"+sol.maximumRemovals("abcacb", "ab", new int[]{3, 1, 0}));  // Output: 2
        System.out.println("answer"+sol.maximumRemovals("abcbddddd", "abcd", new int[]{3, 2, 1, 4, 5, 6}));  // Output: 1
        System.out.println("answer"+sol.maximumRemovals("abcab", "abc", new int[]{0, 1, 2, 3, 4}));  // Output: 0
    }
}
