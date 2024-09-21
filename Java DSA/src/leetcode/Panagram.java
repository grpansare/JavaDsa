package leetcode;

public class Panagram {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		
	}
	 public boolean checkIfPangram(String sentence) {
	      boolean isPresent=false;
		 String alphabets="abcdefghijklmnopqrstuvwxyz";
		 for(int i=0;i<sentence.length();i++) {
			 char a=alphabets.charAt(i);
//			 isPresent=sentence.contains(a);
		 }
		 return true;
		
	    }

}
