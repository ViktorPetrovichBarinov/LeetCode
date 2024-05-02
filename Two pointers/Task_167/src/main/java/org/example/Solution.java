package org.example;


import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int leftNumber = numbers[left];
            int rightNumber = numbers[right];
            int sum = leftNumber + rightNumber;
            if (sum == target) {
                answer[0] = left + 1;
                answer[1] = right + 1;
                return answer;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}