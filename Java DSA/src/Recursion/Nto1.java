package Recursion;

public class Nto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fun(5);
	}
	static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		fun(--n);
	}
	static void funRev(int n) {
		
		if(n==0) {
			return;
		}
		
		funRev(n-1);
		System.out.println(n);
	}
static void funBoth(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		funBoth(n-1);
		System.out.println(n);
	}
	

}
