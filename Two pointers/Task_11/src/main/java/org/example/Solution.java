package org.example;


public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            if (leftHeight < rightHeight) {
                max = Math.max(max, (right - left) * leftHeight);
                left++;
            } else {
                max = Math.max(max, (right - left) * rightHeight);
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}