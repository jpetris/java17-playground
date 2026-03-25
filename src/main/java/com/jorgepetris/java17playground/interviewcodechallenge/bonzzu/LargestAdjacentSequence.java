package com.jorgepetris.java17playground.interviewcodechallenge.bonzzu;

import java.util.List;

/**
 * 2026-03-23
 * <p>
 * Given a list of integers, find the length of the longest sequence of adjacent numbers.
 * For example, given the list [1, 2, 3, 5, 6, 7, 8], the longest sequence of adjacent numbers is [5, 6, 7, 8], which has a length of 4.
 * </p>
 */

public class LargestAdjacentSequence {

    public static int findLongestSequence(List<Integer> input) {
        // 1. Sorting the input list
        List<Integer> sortedInput = input.stream().sorted().toList();

        // 2. Traverse the sorted list and keep track of the largest count
        int currentCount = 0;
        int maxCount = 0;

        for (int i = 0; i < sortedInput.size(); i++) {
            // Is this the first iteration
            if (i == 0) {
                currentCount++;
                maxCount++;
                continue;
            }

            // 3. Update the value accordingly
            int prev = sortedInput.get(i - 1);
            int current = sortedInput.get(i);

            if (current == prev + 1) {
                currentCount++;
                maxCount = Math.max(currentCount, maxCount);
            } else {
                maxCount = Math.max(currentCount, maxCount);
                currentCount = 1;
            }

        }
        // 4. Return the max count after the list is completed
        return maxCount;

    }
}

