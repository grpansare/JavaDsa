package Strings;

public class SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<26;i++) {
 			char a=(char)('a'+i);//'a'+i will give ascii value and we convert it to char
 			sb.append(a);
 		}
         System.out.println(sb.toString());
         
	}

}
