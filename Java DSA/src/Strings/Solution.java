package Strings;
class Solution {
	public static void main(String[] args) {
		String command="G()(al)";
		System.out.println(interpret(command));
	}
    public static String interpret(String command) {
//    	Input: command = "G()(al)"
//    			Output: "Goal"
//    			Explanation: The Goal Parser interprets the command as follows:
//    			G -> G
//    			() -> o
//    			(al) -> al
//    			The final concatenated result is "Goal".
       
      
    	 
    	        String ans= command.replace("()","o");
    	       ans= ans.replace("(al)","al");
    	       return ans;

    	    
       
    }
}