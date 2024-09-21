package MathsForDsa;

public class EuclideanAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(" GCD is "+findGcd(10, 5));
	}

	private static int findGcd(int n1, int n2) {
		// TODO Auto-generated method stub
		while(n1 > 0 && n2> 0) {
			if(n1 > n2) {
				n1=n1%n2;
			}
			else {
				n2=n2%n1;
			}
		}
		if(n1 == 0) return n2;
		return n1;
	}

}
