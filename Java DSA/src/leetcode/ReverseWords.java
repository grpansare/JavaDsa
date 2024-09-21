package leetcode;



public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	  public static String reverseWords(String s) {
	        String[] arr=s.split(" ");
	        arr=reverse(arr);
	        return String.join(" ", arr);
	        
	        
	    }
	  static String [] reverse(String [] arr) {
		  for(int i=0;i<arr.length;i++) {
			  arr[i]=rev(arr[i]);
		  }
		  return arr;
	  }
	  static String rev(String s) {
		 char [] chars=s.toCharArray();
		 int size=chars.length;
		 for(int i=0;i<chars.length/2;i++) {
			 char temp=chars[i];
			 chars[i]=chars[chars.length-1-i];
			 chars[chars.length-1-i]=temp;
		 }
		 return new String(chars);
	  }

}
