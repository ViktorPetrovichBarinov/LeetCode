package org.example;


import java.util.Arrays;

public class Solution {
    public int longestIdealString(String s, int k) {
        int[] dynamic = new int[27];
        int length = s.length();

        for (int i = length - 1; i >= 0; i--) {
            char curr = s.charAt(i);
            int index = curr - 'a';

            int minIndex = Math.max(index - k, 0);
            int maxIndex = Math.min(index + k, 26);
            int max = Integer.MIN_VALUE;

            for (int j = minIndex; j <= maxIndex; j++) {
                max = Math.max(max, dynamic[j]);
            }
            dynamic[index] = max + 1;
        }

        int max = -1;
        for (int i = 0; i < 27; i++) {
            max = Math.max(max, dynamic[i]);
        }
        return max;
    }
}