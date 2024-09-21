package StringRec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3};
		List<List<Integer>>  list=subSets(arr);
		for(List<Integer> li:list) {
			System.out.println(li);
		}
	}
	static List<List<Integer>> subSets(int [] arr){
		List<List<Integer>> outer=new ArrayList<>();
		
		outer.add(new ArrayList<>());
		
		for(int n:arr) {
			int size=outer.size();
			for(int i=0;i<size;i++) {
				List<Integer> internal=new ArrayList<>(outer.get(i));
			    internal.add(n);
			    outer.add(internal);
			    
				
			}
		}
		return outer;
		
	}
	
	 static List<List<Integer>> subsetDuplicate(int[] arr) {
	        Arrays.sort(arr);
	        List<List<Integer>> outer = new ArrayList<>();
	        outer.add(new ArrayList<>());
	        int start = 0;
	        int end = 0;
	        for (int i = 0; i < arr.length; i++) {
	            start = 0;
	            // if current and previous element is same, s = e + 1
	            if (i > 0 && arr[i] == arr[i-1]) {
	                start = end + 1;
	            }
	            end = outer.size() - 1;
	            int n = outer.size();
	            for (int j = start; j < n; j++) {
	                List<Integer> internal = new ArrayList<>(outer.get(j));
	                internal.add(arr[i]);
	                outer.add(internal);
	            }
	        }
	        return outer;
	    }

}
