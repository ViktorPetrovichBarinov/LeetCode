package org.example;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length + 1];
        for (int i = 0; i < length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 0; i <= length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.missingNumber(new int[]{3,0,1}));
    }
}