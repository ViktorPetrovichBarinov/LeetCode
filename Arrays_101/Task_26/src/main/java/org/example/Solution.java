package org.example;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int index = 1;
        int lastElem = nums[0];
        for (int i = 1; i < length; i++) {
            if (nums[i] != lastElem) {
                nums[index++] = nums[i];
                lastElem = nums[i];
            }
        }
        return index;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(sol.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}