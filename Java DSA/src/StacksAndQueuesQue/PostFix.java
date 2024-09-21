package StacksAndQueuesQue;

import java.util.Stack;

public class PostFix {

	
	static String postfix(String str) {
		Stack<Character> stack=new Stack<>();
		String ans="";
	
		int i=0;
		while(i<str.length()) {
			System.out.println("func");
			char ch=str.charAt(i);
			if((ch>='A' && ch<='Z' )|| (ch >='a' && ch<='z') ||
					ch>='0' && ch<='9') {
				ans+=ch;
			}
		
			else if(ch=='(') {
				stack.push(ch);
			}
			else if(ch == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					ans+=stack.pop();
				}
				if(!stack.isEmpty()) {
				stack.pop();
				}
			}
			else {
				while(!stack.isEmpty() && priority(ch) <= priority(stack.peek())) {
					ans+=stack.pop();
				}
				stack.push(ch);
			}
			i++;
		}
		while(!stack.isEmpty()) {
			ans+=stack.pop();
		}
		return ans;
	}
	private static int priority(char ch) {
		if(ch =='^') {
			return 3;
		}
		if(ch == '/' || ch=='*') {
			return 2;
		}
		if(ch=='+' || ch=='-') {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(postfix("a+b*(c^d-e)"));
	}

}
