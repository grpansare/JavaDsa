package NumberSystem;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=34567;
        int b=10;
        int ans=(int)((Math.log(n)/ Math.log(b)))+1;
        System.out.println(ans);
	}

}
