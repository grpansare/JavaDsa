package StacksAndQueuesQue;

import java.util.Stack;

class evalRPN {
      public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                // Pop the top two elements for operation
                int b = stack.pop();
                int a = stack.pop();
                
                // Perform the corresponding operation
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);  // Integer division, truncates toward zero
                        break;
                }
            } else {
                // If it's a number, push it to the stack
                stack.push(Integer.parseInt(token));
            }
        }
        // The final result will be in the stack
        return stack.pop();
    }

    // Helper function to check if the token is an operator
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}