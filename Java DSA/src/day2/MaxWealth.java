package day2;

public class MaxWealth {
public static void main(String[] args) {
	int [][] accounts= {
			{10,23,30},
			{34,23,34},
			{90,78,77}
	};
	System.out.println(maxWealth(accounts));
	
}
//public static int maxWealth(int [][] accounts) {
//		int ans=Integer.MIN_VALUE;
//   for(int person=0;person<accounts.length;person++) {
//	   int sum=0;
//	   
//	 for(int account=0;account<accounts[person].length;account++) {
//			sum+=accounts[person][account];
//			}
//	 
//	 if(sum>ans) {
//		 ans=sum;
//	 }
//		}
//   return ans;
//	
//	
//}
 static int maxWealth(int [][] accounts) {
	int ans=Integer.MIN_VALUE;
for(int [] person:accounts) {
   int sum=0;
   for(int account:person) {
	   sum+=account;
   }

 
 if(sum>ans) {
	 ans=sum;
 }
	}
return ans;


}
}
