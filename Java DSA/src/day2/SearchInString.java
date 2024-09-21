package day2;

public class SearchInString {
public static void main(String[] args) {
	String str="ganesh";
	char target='a';
	System.out.println(Search2(str,target));
}
static boolean Search(String str,char target) {
	if(str.length()==0) {
		return false;
	}
	for(int i=0;i<str.length();i++) {
		if(target == str.charAt(i)) {
			return true;
		}
	}
	return false;
}
static boolean Search2(String str,char target) {
	if(str.length()==0) {
		return false;
	}
	for(char ch:str.toCharArray()) {
		if(ch == target) {
			return true;
		}
	}
	return false;
}
}
