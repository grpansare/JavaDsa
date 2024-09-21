package StacksAndQueuesQue;

import java.util.Stack;

public class PostFixToPrefix {
     
	 static String postToPre(String post_exp) {
		 Stack<String> stack=new Stack<>();
			int i=0;
			while(i<post_exp.length()) {
				char ch=post_exp.charAt(i);
				if((ch>='A' && ch<='Z' )|| (ch >='a' && ch<='z') ||
						ch>='0' && ch<='9') {
					stack.push(new String(ch+""));
				}
				else {
					String f=stack.pop();
					String s=stack.pop();
					String r=ch+s+f;
					stack.push(r);
				}
				i++;
			}
			return stack.pop();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
