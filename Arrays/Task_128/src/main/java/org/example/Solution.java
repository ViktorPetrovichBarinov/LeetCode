package org.example;

public class Solution {
    public int longestConsecutive(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int histLength = max - min + 1;
        boolean[] histogram = new boolean[histLength];

        for (int num : nums) {
            histogram[num - min] = true;
        }

        int answer = 0;
        int currentLength = 0;
        for (boolean b : histogram) {
            if (currentLength != 0) {
                if (b) {
                    currentLength++;
                } else {
                    answer = Math.max(currentLength, answer);
                    currentLength = 0;
                }
            } else {
                if (b) {
                    currentLength++;
                }
            }
        }
        return Math.max(answer, currentLength);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}