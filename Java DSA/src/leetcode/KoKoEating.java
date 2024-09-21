package leetcode;

public class KoKoEating {
	
	 public static int minEatingSpeed(int[] piles, int h) {
	          int low=1;
	          int high=max(piles);
	          int ans=0;
	          
	          while(low<=high) {
	        	  int mid=low+(high-low)/2;
//	        	  System.out.println(mid);
	        	 int totalhrs=getHours(piles,mid);
	        	
	        	 if(totalhrs<=h) {
	        		 ans=mid;
	        		 high=mid-1;
	        	 }
	        	 else {
	        		 low=mid+1;
	        	 }
	          }
	          return ans;
	    }
	 
	 static int getHours(int [] arr,int mid) {
		 int totalhrs=0;
		 for(int i=0;i<arr.length;i++) {
			 totalhrs+=Math.ceil((double)arr[i]/(double) mid);
			 
		 }
		 System.out.println("total hrs"+totalhrs);
		 return totalhrs;
	 }
     static int max(int [] piles) {
    	 int max=piles[0];
    	 for(int i:piles) {
    		 if(max<i) {
    			 max=i;
    		 }
    	 }
    	 return max;
    	 
    	 
    	 
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //k->bananas/hr
		//piles[]=[3,6,7,11]
		//h=8
		int [] piles= {3,6,7,11};
		int k=minEatingSpeed(piles,8);
		System.out.println(k);
		
		
	}

}
