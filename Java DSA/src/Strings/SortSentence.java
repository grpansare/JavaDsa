package Strings;

public class SortSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: s = "is2 sentence4 This1 a3"
//				Output: "This is a sentence"
//				Explanation: Sort the words in s to their original positions
//		"This1 is2 a3 sentence4",
//		then remove the numbers.
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
	}
	 public static String sortSentence(String s) {
		 String[] arr = s.split(" ");
	        String[] result = new String[arr.length];

	        for (String word : arr) {
	            // Get the position from the last character of the word
	        	int a=word.length() - 1;
	            int position = word.charAt(a) - '1' ;
	            System.out.println(position);
	            // Remove the number and put the word in the correct position
//	            result[position] = word.substring(0, word.length() - 1);
	        }

	        return String.join(" ", result);
		 
	
}
	 
}


