package org.example;

public class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int length = s.length();
        int currentLength = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(') {
                currentLength++;
                max = Math.max(max, currentLength);
            }
            if (s.charAt(i) == ')') {
                currentLength--;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}