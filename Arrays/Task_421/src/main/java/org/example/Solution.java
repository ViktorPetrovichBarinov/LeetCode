package org.example;

public class Solution {
    public int findMaximumXOR(int[] nums) {
        int length = nums.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                max = Math.max(max, nums[i] ^ nums[j]);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findMaximumXOR(new int[]{14,70,53,83,49,91,36,80,92,51,66,70}));
    }
}