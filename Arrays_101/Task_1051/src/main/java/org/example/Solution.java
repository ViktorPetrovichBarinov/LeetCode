package org.example;

import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int answer = 0;
        int length = heights.length;
        for (int i = 0; i < length; i++) {
            if (heights[i] != sorted[i]) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}