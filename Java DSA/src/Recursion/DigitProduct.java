package Recursion;

public class DigitProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prod(1234));
	}

	private static int prod(int n) {
		// TODO Auto-generated method stub
		if(n%10==n) {
			return 1;
		}
		return (n%10) * prod(n/10);
	}
}
