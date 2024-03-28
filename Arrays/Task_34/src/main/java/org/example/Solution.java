package org.example;

import java.util.Arrays;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lowIndex = binSearch(nums, target, 0, nums.length - 1);
        if (lowIndex == -1) {
            return new int[] {-1, -1};
        } else {
            int highIndex = lowIndex;
            while(highIndex < nums.length && nums[highIndex] == target) {
                highIndex++;
            }
            highIndex--;
            return new int[]{lowIndex, highIndex};
        }
    }

    public int binSearch(int[] nums, int value, int lowIndex, int highIndex) {
        int index = -1;

        while(lowIndex <= highIndex) {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;
            if (nums[midIndex] < value) {
                lowIndex = ++midIndex;
            } else if (nums[midIndex] > value) {
                highIndex = --midIndex;
            } else if (nums[midIndex] == value) {
                index = midIndex;
                while(index >= 0 && nums[index] == value) {
                    index--;
                }
                index++;
                return index;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.searchRange(new int[]{1}, 1)));
    }
}