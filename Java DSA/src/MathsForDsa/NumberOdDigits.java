package MathsForDsa;

public class NumberOdDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println( digits2(7789));
	}

	private static int digits(int n) {
		// TODO Auto-generated method stub
//		int revnum=0;
		int count=0;
		while(n>0) {
//			int last=n%10;
			count++;
//		     revnum=revnum*10+last;
		    n=n/10;
		}
		return count;
	}
	private static int digits2(int n) {
		int count=(int)(Math.log10(n) + 1);
		return count;
	}

}
