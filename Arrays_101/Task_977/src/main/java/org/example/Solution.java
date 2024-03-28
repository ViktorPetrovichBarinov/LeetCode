package org.example;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] histogram = new int[40001];
        for (int i = 0; i < length; i++) {
            histogram[Math.abs(nums[i])]++;
        }

        int[] result = new int[length];
        int resultStartIndex = 0;
        for (int i = 0; i < 40001; i++) {
            while (histogram[i] != 0) {
                histogram[i]--;
                result[resultStartIndex++] = i * i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.sortedSquares(new int[]{-7,-3,2,3,11})));
    }
}