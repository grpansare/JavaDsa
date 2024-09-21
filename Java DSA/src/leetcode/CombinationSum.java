package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] candidates= {2,3,6,7};
		List<List<Integer>> result = combinationSum(candidates,7);
		System.out.println(result);
	}
	  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> result = new ArrayList<>();
	        backtrack(candidates, target, 0, new ArrayList<>(), result);
	        return result;
	    }

	    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
	        // If the target is reached, add the current combination to the result
	        if (target == 0) {
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        // If the target becomes negative, there is no need to proceed further
	        if (target < 0) {
	        	System.out.println(current+" "+target);
	            return;
	        }

	        // Explore all candidates starting from the current index
	        for (int i = start; i < candidates.length; i++) {
	            current.add(candidates[i]);
	            // Since the same number can be used again, we pass 'i' instead of 'i+1'
	            backtrack(candidates, target - candidates[i], i, current, result);
	            // Backtrack to explore other combinations
	            current.remove(current.size() - 1);
	        }
	    }
}
