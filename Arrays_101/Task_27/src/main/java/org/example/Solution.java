package org.example;

import java.util.Arrays;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int[] clone = nums.clone();
        int length = clone.length;
        int numsIndex = 0;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (clone[i] != val) {
                nums[numsIndex++] = clone[i];
                counter++;
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(sol.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}