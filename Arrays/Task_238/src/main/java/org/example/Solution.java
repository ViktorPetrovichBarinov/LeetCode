package org.example;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int leftComposition = 1;
        int rightComposition = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = rightComposition;
            rightComposition *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            answer[i] *= leftComposition;
            leftComposition *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
}