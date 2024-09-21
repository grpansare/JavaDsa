package CustomStackAndQueue;

public class StackMain {

	public static void main(String[] args) throws StackException {
		// TODO Auto-generated method stub
       Stack stack=new DynamicStack(5);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       stack.push(6);
       stack.push(7);
       stack.push(10);
       
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
//       System.out.println(stack.pop());
	}

}
