package org.example;

import java.util.HashMap;

public class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        Integer longestSubsequence = 0;
        Integer currentSubsequence = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentElement = nums[i];
            if (counter.containsKey(currentElement)){
                int currentCountNumbersInSubsequence = counter.get(currentElement);
                if (currentCountNumbersInSubsequence == k) {
                    int startIndex = i - currentSubsequence;
                    while(true) {
                        currentSubsequence--;
                        int checkedNumber = nums[startIndex];
                        counter.put(checkedNumber, counter.get(checkedNumber) - 1);
                        if (nums[startIndex] == currentElement) {
                            counter.put(checkedNumber, counter.get(checkedNumber) + 1);
                            break;
                        }
                        startIndex++;
                    }
                    currentSubsequence++;
                } else {
                    currentSubsequence++;
                    counter.put(currentElement, currentCountNumbersInSubsequence + 1);
                    longestSubsequence = Math.max(longestSubsequence, currentSubsequence);
                }
            } else {//если не содержит
                counter.put(currentElement, 1);
                currentSubsequence++;
                longestSubsequence = Math.max(longestSubsequence, currentSubsequence);
            }
        }
        return longestSubsequence;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxSubarrayLength(new int[]{1,2,2,1,3}, 1));
    }
}