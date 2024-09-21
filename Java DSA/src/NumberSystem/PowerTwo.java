package NumberSystem;

public class PowerTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=32;
           boolean ans=(n & (n-1)) == 0;
           System.out.println(ans);
	}

}
