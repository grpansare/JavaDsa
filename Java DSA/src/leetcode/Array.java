package leetcode;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
            System.out.println(target);
        }
        
        // Convert the List to an array
        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 3, 4};
        int[] index1 = {0, 1, 2, 2, 1};
        int[] result1 = createTargetArray(nums1, index1);
        System.out.println(java.util.Arrays.toString(result1)); // Output: [0, 4, 1, 3, 2]

        int[] nums2 = {1, 2, 3, 4, 0};
        int[] index2 = {0, 1, 2, 3, 0};
        int[] result2 = createTargetArray(nums2, index2);
        System.out.println(java.util.Arrays.toString(result2)); // Output: [0, 1, 2, 3, 4]
    }
}
