package StacksAndQueuesQue;

import java.util.Stack;

public class PostFixToInfix {
	
	
	static String postFixToinfix(String str) {
		Stack<String> stack=new Stack<>();
		int i=0;
		while(i<str.length()) {
			char ch=str.charAt(i);
			if((ch>='A' && ch<='Z' )|| (ch >='a' && ch<='z') ||
					ch>='0' && ch<='9') {
				stack.push(new String(ch+""));
			}
			else {
				String f=stack.pop();
				String s=stack.pop();
				String r="("+s+ch+f+")";
				stack.push(r);
			}
			i++;
		}
		return stack.pop();
	}
	public static void main(String[] args) {
		System.out.println(postFixToinfix("ab*c+"));
	}

}
