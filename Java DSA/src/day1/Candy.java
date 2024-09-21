package day1;

import java.util.HashSet;
import java.util.Set;

class Candy {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
         int sumAlice = 0;
        int sumBob = 0;

        // Calculate the total number of candies each person has
        for (int candy : aliceSizes) {
            sumAlice += candy;
        }
        for (int candy : bobSizes) {
            sumBob += candy;
        }

        // Calculate the difference that needs to be adjusted
        int diff = (sumAlice - sumBob) / 2;
        System.out.println("dif " +diff);
        // Convert Bob's sizes to a set for quick lookup
        Set<Integer> bobSet = new HashSet<>();
        for (int candy : bobSizes) {
            bobSet.add(candy);
        }

        // Find the pair of candies to exchange
        for (int candy : aliceSizes) {
            int targetBobCandy = candy - diff;
            if (bobSet.contains(targetBobCandy)) {
                return new int[]{candy, targetBobCandy};
            }
        }

        // Return an empty array if no solution is found (although the problem guarantees at least one solution)
        return new int[]{};
}
    
    public static void main(String[] args) {
        int[] aliceSizes1 = {1, 1};
        int[] bobSizes1 = {2, 2};
        System.out.println("Answer: " + java.util.Arrays.toString(fairCandySwap(aliceSizes1, bobSizes1)));

        int[] aliceSizes2 = {1, 2};
        int[] bobSizes2 = {2, 3};
        System.out.println("Answer: " + java.util.Arrays.toString(fairCandySwap(aliceSizes2, bobSizes2)));

        int[] aliceSizes3 = {2};
        int[] bobSizes3 = {1, 3};
        System.out.println("Answer: " + java.util.Arrays.toString(fairCandySwap(aliceSizes3, bobSizes3)));
    }
}

