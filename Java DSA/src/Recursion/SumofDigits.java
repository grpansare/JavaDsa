package Recursion;

public class SumofDigits {
	public static void main(String[] args) {
		System.out.println(sum(1234));
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}
		return (n%10) + sum(n/10);
	}
}
