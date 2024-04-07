package org.example;

public class Solution {
    public boolean checkValidString(String s) {
        int openMin = 0;
        int openMax = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                openMin++;
                openMax++;
            }
            if (currentChar == ')') {
                openMin--;
                openMax--;
            }
            if (currentChar == '*') {
                openMin--;
                openMax++;
            }
            if (openMax < 0) {
                return false;
            }
            if (openMin < 0) {
                openMin = 0;
            }
        }

        return openMin == 0;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.checkValidString(")"));
    }
}