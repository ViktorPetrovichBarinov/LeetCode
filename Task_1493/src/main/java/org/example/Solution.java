package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int longestSubarray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                break;
            }
            if (i == nums.length - 1) {
                return 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                break;
            }
            if (i == nums.length - 1) {
                return nums.length - 1;
            }
        }

        int index = 0;
        int max = Integer.MIN_VALUE;
        int prev = 0;
        while(index < nums.length) {
            while(index < nums.length && nums[index] != 1) {
                index++;
            }
            int current = 0;
            while(index < nums.length && nums[index] != 0) {
                index++;
                current++;
            }
            max = Math.max(max, current + prev);
            prev = current;
            if (index + 1 < nums.length && nums[index + 1] == 0) {
                prev = 0;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = new int[]{1,1,1};
        int[] arr2 = new int[]{1,1,1,0,1,1,0,1,0,0,0};

        //System.out.println(sol.longestSubarray(arr1));
        System.out.println(sol.longestSubarray(arr2));
    }
}