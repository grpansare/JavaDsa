package day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterSection {
//    public static int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> intersection = new HashSet<>();
//        
//        // Add all elements of nums1 to set1
//        for (int num : nums1) {
//            set1.add(num);
//        }
//        System.out.println("set1"+set1);
//        // Check if elements of nums2 are in set1
//        for (int num : nums2) {
//            if (set1.contains(num)) {
//                intersection.add(num);
//            }
//      }
//        System.out.println("inter"+intersection);
//        // Convert the intersection set to an array
//        int[] result = new int[intersection.size()];
//        int index = 0;
//        for (int num : intersection) {
//            result[index++] = num;
//        }
//        
//        return result;
//    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};
//        System.out.println("Intersection: " + Arrays.toString(intersection(nums1, nums2)));
//
//        int[] nums1_2 = {4, 9, 5};
//        int[] nums2_2 = {9, 4, 9, 8, 4};
//        System.out.println("Intersection: " + Arrays.toString(intersection(nums1_2, nums2_2)));
    	
    	Set<Integer> set1=new HashSet<>();
    	set1.add(3);
    	set1.add(4);
    	set1.add(3);//set does not include duplicate element
    	System.out.println(set1);
    }
}

