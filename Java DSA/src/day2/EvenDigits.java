package day2;

public class EvenDigits {
public static void main(String[] args) {
	int []arr= {33,4,34,-4567,0};
	System.out.println(findNumbers(arr));
}
static int findNumbers(int [] arr) {
	int count=0;
	for(int num:arr) {
		if(even(num)) {
			count++;
		}
	}
	return count;
}
//function to check no contain even digits or not
static boolean even(int n) {
	int numberOfDigits=digits(n);
	return numberOfDigits % 2 != 0;
}


//static int digits2(int no) {
//	if(no<0) {
//		no=no * -1;
//	}
//	return (int)(Math.log10(no))+1;)
//}
static int digits(int no) {
	if(no<0) {
		no=no * -1;
	}
	if(no == 0) {
		return 1;
	}
	int count=0;
	while(no>0) {
		count++;
		no=no/10;
	}
	return count;
}
}
