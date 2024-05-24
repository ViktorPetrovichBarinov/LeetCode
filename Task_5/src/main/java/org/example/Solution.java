package org.example;

public class Solution {
    public String longestPalindrome(String s) {
//        if (s.length() == 1) {
//            return s;
//        }
        StringBuilder sb;
        int max = 0;
        String maxStr = "";
        for (int i = 0; i < s.length(); i++) {
            int currentLength = 1;
            int padding = 1;
            if (i - padding >= 0 && i + padding < s.length()) {
                if (s.charAt(i - padding) == s.charAt(i + padding)) {
                    currentLength += 2;
                } else {

                }
            }
        }
        return maxStr;
    }

    private boolean isPolyndrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestPalindrome("b"));
    }
}