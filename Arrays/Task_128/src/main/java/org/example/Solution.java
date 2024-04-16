package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int[] numsWithoutDuplicates = new int[set.size()];
        int index = 0;
        for (int num : set) {
            numsWithoutDuplicates[index++] = num;
        }
        Arrays.sort(numsWithoutDuplicates);
        int lastElem = numsWithoutDuplicates[0];
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < numsWithoutDuplicates.length; i++) {
            if (currentLength == 1) {
                if (numsWithoutDuplicates[i] - 1 == lastElem) {
                    currentLength++;
                }
            } else {
                if (numsWithoutDuplicates[i] - 1 == lastElem) {
                    currentLength++;
                } else {
                    maxLength = Math.max(maxLength, currentLength);
                    currentLength = 1;
                }
            }
            lastElem = numsWithoutDuplicates[i];
        }
        return Math.max(maxLength, currentLength);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestConsecutive(new int[]{1, 2, 0, 1}));
    }
}