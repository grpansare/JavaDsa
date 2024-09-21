package NumberSystem;

public class SetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10;
         System.out.println(Integer.toBinaryString(a));
         System.out.println(setBits(a));
	}

	private static int setBits(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n & (n-1);
		}
		return count;
	}

}
