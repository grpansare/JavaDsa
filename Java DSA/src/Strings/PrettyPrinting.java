package Strings;

import java.util.ArrayList;

public class PrettyPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        System.out.println(Math.PI);
//        System.out.printf("Pi: %.2f",Math.PI);
//        System.out.printf("My name is %s", "ganesh");
		
//		System.out.println('a'+'b');//use ascci value to add
//		System.out.println("s"+"b");
//		System.out.println('a'+3);//convert a into its ascii value
//		System.out.println((char)('a'+3));//d
		
//		System.out.println("a"+1);
		//int is converted to Integer and toString is called
//		ArrayList<Integer> a=new ArrayList<>();
//		a.add(1);
//		System.out.println("a"+a);//tostring of list is called
		
		System.out.println((char)100);
		
		String series="";
		for(int i=0;i<26;i++) {
			char a=(char)('a'+i);//'a'+i will give ascii value and we convert it to char
			series+=a;
		}
		System.out.println(series);
		
	}

}
