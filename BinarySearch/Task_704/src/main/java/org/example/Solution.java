package org.example;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int middle = (right + left)/2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.search(new int[]{-1,0,3,5,9,12}, 2));
    }
}