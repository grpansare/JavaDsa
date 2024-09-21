package NumberSystem;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=20;
       for(int i=1;i<=n;i++) {
    	   System.out.println(i+" "+isPrime(i));
       }
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n % c == 0) {
				return false;
			}
			c++;
		}
		return true;
	}

}
