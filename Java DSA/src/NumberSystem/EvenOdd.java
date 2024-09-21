package NumberSystem;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=17;
   System.out.println(isOdd(a));
	}

	private static boolean isOdd(int a) {
		// TODO Auto-generated method stub
		return (a&1) == 1 ;
	}

}
