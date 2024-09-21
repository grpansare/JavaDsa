package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> arr=new ArrayList<>();
         for(int i=0;i<5;i++) {
        	 arr.add(i+1);
         }
//         arr.forEach((item)-> System.out.println(item*2));
         
//         Consumer<Integer> sum=(item)-> System.out.println(item*2);
//         arr.forEach(sum);
         Operation sum=(a,b)->a+b;
         Operation prod=(a,b)->a*b;
         Operation sub=(a,b)->a-b;
         LambdaFunctions lb=new LambdaFunctions();
        System.out.println( lb.operate(1, 2, sub));
         
	}
	public int operate(int a,int b,Operation op) {
		return op.operate(a,b);
	}
	
	
}
interface Operation{
	int operate(int a,int b);
}

