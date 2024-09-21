package NumberSystem;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int base=3;
       int power=6;
       int ans=1;
       while(power>0) {
    	   if((power & 1) ==1) {
    		   ans*=base;
    	   }
    	   base*=base;
    	   System.out.println(base);
    	   power=power >> 1;
       }
       System.out.println(ans);
	}

}
