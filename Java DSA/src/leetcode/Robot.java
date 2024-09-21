package leetcode;
class Robot {
    public static boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        
        for(int i=0;i<moves.length();i++){
           char ch=moves.charAt(i);
           switch(ch){
            case 'R':
            x++;
            break;
            case 'L':
            x--;
            break;
            case 'U':
            y++;
            break;
            case 'D':
            y--;
            break;

           }  
           
        }
        if(x==0 && y==0) {
        	return true;
        }
        return false;
    }
    public static void main(String[] args) {
		System.out.println(judgeCircle("Lp"));
	}
}