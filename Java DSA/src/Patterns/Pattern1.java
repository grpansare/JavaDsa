package Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
