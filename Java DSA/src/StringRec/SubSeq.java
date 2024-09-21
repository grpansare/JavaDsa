package StringRec;

import java.util.ArrayList;

public class SubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println( subseqList("", "abc"));
	}
    static void subseq(String p,String up) {
    	if(up.isEmpty()) {
    		System.out.println(p);
    		return;
    	}
    	char ch=up.charAt(0);
    	//add
    	subseq(p+ch,up.substring(1));
    	//ignone
    	subseq(p,up.substring(1));
    }
    static ArrayList<String> subseqList(String p,String up) {
    	if(up.isEmpty()) {
    		ArrayList<String> list=new ArrayList<>();
    		list.add(p);
    		return list;
    	}
    	char ch=up.charAt(0);
    	//add
      ArrayList<String> left=	subseqList(p+ch,up.substring(1));
    	ArrayList<String> right=subseqList(p,up.substring(1));
    	left.addAll(right);
    	return left;
    	
    }
}
