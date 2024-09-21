package NumberSystem;

public class MagicNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int base=5;
		int ans=0;
		while(n>0) {
			int last=n & 1;
			n=n>>1;
			ans+=last*base;
			base=base*5;
			
		}
		System.out.println(ans);

	}

}
