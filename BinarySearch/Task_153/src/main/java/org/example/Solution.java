package org.example;


public class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findMin(new int[]{2, 1}));
    }
}