package org.example;

import java.util.Arrays;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int leftIndex = 0;
        int oddIndex = 0;
        int length = nums.length;
        while(oddIndex < length) {
            if (nums[oddIndex] % 2 == 0) {
                while(leftIndex < oddIndex) {
                    if (nums[leftIndex] % 2 == 1) {
                        int tmp = nums[leftIndex];
                        nums[leftIndex] = nums[oddIndex];
                        nums[oddIndex] = tmp;
                        break;
                    }
                    leftIndex++;
                }
            }
            oddIndex++;
        }
        return nums;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.sortArrayByParity(new int[] {0, 1})));
    }
}