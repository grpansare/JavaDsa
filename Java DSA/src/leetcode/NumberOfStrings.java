package leetcode;

public class NumberOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: patterns = ["a","abc","bc","d"], word = "abc"
//				Output: 3
//				Explanation:
//				- "a" appears as a substring in "abc".
//				- "abc" appears as a substring in "abc".
//				- "bc" appears as a substring in "abc".
//				- "d" does not appear as a substring in "abc".
//				3 of the strings in patterns appear as a substring in word.
	String []	patterns = {"a","abc","bc","d"};
		System.out.println(numOfStrings(patterns,"abc"));
	}
public static int numOfStrings(String[] patterns, String word) {
          int count=0;
          for(String str:patterns) {
        	  if(word.contains(str)) {
        		  count++;
        	  }
        	  
          }
          return count;
    }

}
