package day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListExample {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>(10);
//		list.add(1);
//		list.add(10);
//		list.add(100);
//		list.add(0,9);
//		list.set(1, 99);
//		list.remove(1);
	System.out.println(list);
LinkedList<Integer> list1=new LinkedList<Integer>();

  for(int i=0;i<5;i++) {
	  list.add(in.nextInt());
  }
//  for(int i=0;i<list.size();i++) {
//	  System.out.println(list.get(i));
//  }
  for(Integer i:list) {
	  System.out.println(i);
  }
}
 
	
	
}
