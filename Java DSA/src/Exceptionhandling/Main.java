package Exceptionhandling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //unchecked exc:not checked at compile time
		try {
//			divide(5,0);
//			throw new Exception("Normal exception");
			throw new MyException("my exception");
		}
		catch(MyException e) {
		System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Exit");
		}
	}

	private static int divide(int a, int b) throws ArithmeticException {
	  if(b==0) {
		  throw new ArithmeticException("please do not divide by zero");
	  }
	  return a/b;
		
	}

}
