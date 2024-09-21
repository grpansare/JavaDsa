package StacksAndQueuesQue;

import java.util.Stack;

public class PrefixToPostFix {
	static String preToPost(String pre_exp) {
		Stack<String> stack=new Stack<>();
		int i=pre_exp.length()-1;
		while(i>=0) {
			char ch=pre_exp.charAt(i);
			if((ch>='A' && ch<='Z' )|| (ch >='a' && ch<='z') ||
					ch>='0' && ch<='9') {
				stack.push(new String(ch+""));
			}
			else {
				String f=stack.pop();
				String s=stack.pop();
				String r=f+s+ch
				stack.push(r);
			}
			i--;
		}
		return stack.pop();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
