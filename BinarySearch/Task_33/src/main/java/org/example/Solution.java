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
        return left;
    }

    public int search(int[] nums, int target) {

        int shift = findMin(nums);
        int left = shift;
        int right;
        if (left == 0) {
            right = nums.length - 1;
        } else {
            right = left - 1;
        }



        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.search(new int[] {1, 3}, 0));

    }
}