package Recursion;

public class ReverseNumber {
    static int sum=0;
    static void revNum(int n) {
		if(n==0) {
			return;
		}
		int rem=n%10;
		sum=sum*10+rem;
		revNum(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          revNum(1234);
          System.out.println(sum);
	}
	

}
