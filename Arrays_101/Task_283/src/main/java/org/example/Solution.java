package org.example;

public class Solution {
    public void moveZeroes(int[] nums) {
        int leftIndex = 0;
        int rightIndex = 0;
        int length = nums.length;
        while(rightIndex < length) {
            int currentNumber = nums[rightIndex];
            if (currentNumber != 0) {
                nums[leftIndex++] = currentNumber;
            }
            rightIndex++;
        }

        while(leftIndex < length) {
            nums[leftIndex++] = 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}