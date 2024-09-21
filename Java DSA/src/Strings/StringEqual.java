package Strings;

public class StringEqual {
	public static void main(String[] args) {
	String []	word1 = {"ac", "b"}, word2 = {"a", "bc"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}
	  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	         String first=String.join("", word2);
	         String second=String.join("", word2);
	         System.out.println(first+" "+second);
	         if(first.equals(second)) {
	        	 return true;
	         }
	         return false;
	         
	         
	    }
}

