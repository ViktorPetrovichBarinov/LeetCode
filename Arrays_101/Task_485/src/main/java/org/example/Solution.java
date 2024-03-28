package org.example;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int currentNumberOfConsecutive = 0;
        int maxNumberOfConsecutive = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentNumberOfConsecutive++;
                if (currentNumberOfConsecutive > maxNumberOfConsecutive) {
                    maxNumberOfConsecutive = currentNumberOfConsecutive;
                }
            } else {
                currentNumberOfConsecutive = 0;
            }
        }
        return maxNumberOfConsecutive;
    }
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        System.out.println(sol.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
//        System.out.println(sol.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
//        System.out.println(sol.findMaxConsecutiveOnes(new int[]{1,1,1,1,1,1}));
//    }
}