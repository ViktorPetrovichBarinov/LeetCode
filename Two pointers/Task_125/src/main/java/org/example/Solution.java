package org.example;


public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = s.charAt(left);

            if (!Character.isAlphabetic(leftChar) && !Character.isDigit(leftChar)) {
                left++;
                continue;
            } else {
                leftChar = Character.toLowerCase(leftChar);
            }

            char rightChar = s.charAt(right);
            if (!Character.isAlphabetic(rightChar) && !Character.isDigit(rightChar)) {
                right--;
                continue;
            } else {
                rightChar = Character.toLowerCase(rightChar);
            }

            if (leftChar != rightChar) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome("0P"));
    }
}