package StacksAndQueuesQue;

import java.util.Stack;

public class PrefixtoInfix {
	
	static String PrefixtoInfix(String exp) {
		
	Stack<String> stack=new Stack<>();
	int i=exp.length()-1;
	while(i>=0) {
		char ch=exp.charAt(i);
		if((ch>='A' && ch<='Z' )|| (ch >='a' && ch<='z') ||
				ch>='0' && ch<='9') {
			stack.push(new String(ch+""));
		}
		else {
			String f=stack.pop();
			String s=stack.pop();
			String r="("+f+ch+s+")";
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
