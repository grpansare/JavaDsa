package NumberSystem;

public class UniqueNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {2,3,3,4,6,2,4};
       System.out.println(UniqueNo(arr));
	}

	private static int UniqueNo(int[] arr) {
		// TODO Auto-generated method stub
		int unique=0;
		for(int a:arr) {
			unique ^=a;
		}
		return unique;
	}

}
