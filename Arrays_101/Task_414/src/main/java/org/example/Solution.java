package org.example;

public class Solution {

    public int thirdMax(int[] nums) {
        int length = nums.length;


        Integer first = nums[0];
        Integer second = null;
        Integer third = null;

        int currentNumber;
        for (int i = 0; i < length; i++) {
            currentNumber = nums[i];
            if (currentNumber > first) {
                third = second;
                second = first;
                first = currentNumber;
            } else if(currentNumber < first) {
                if (second == null) {
                    second = currentNumber;
                } else if (currentNumber > second) {
                    third = second;
                    second = currentNumber;
                } else if (currentNumber < second && (third == null || currentNumber > third)) {
                    third = currentNumber;
                }
            }
        }
        if (third == null || second == null) {
            return first;
        }
        return third;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[] {2,2,3,1};

        System.out.println(sol.thirdMax(nums));
    }
}