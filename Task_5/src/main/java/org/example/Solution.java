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
            sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if (sb.length() <= max) {
                    continue;
                }
                if (isPolyndrom(sb.toString())) {
                    if (max < sb.length()) {
                        max = sb.toString().length();
                        maxStr = sb.toString();
                    }
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