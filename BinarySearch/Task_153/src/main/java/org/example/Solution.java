package org.example;


public class Solution {
    public int findMin(int[] nums) {
        int min = 10000;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
    public static void main(String[] args) {

    }
}