package org.example;

import java.util.Arrays;

public class Solution {
    public long[] findPrefixScore(int[] nums) {
        int length = nums.length;
        long[] answer = new long[length];
        int max = nums[0];
        long score = max * 2;
        answer[0] = score;
        for (int i = 1; i < length; i++) {
            int currentElem = nums[i];
            max = Math.max(max, currentElem);
            score += max + currentElem;
            answer[i] = score;
        }
        return answer;
    }



    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.findPrefixScore(new int[]{2, 3, 7, 5, 10})));
    }
}