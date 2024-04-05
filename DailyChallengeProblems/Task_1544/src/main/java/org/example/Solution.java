package org.example;

public class Solution {
    public String makeGood(String s) {

        StringBuilder answer = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            int length = answer.length();
            for (int j = 0; j + 1 < length; j++) {
                if (answer.charAt(j) - 'a' == answer.charAt(j + 1) - 'A' ||
                answer.charAt(j) - 'A' == answer.charAt(j + 1) - 'a') {
                    answer.delete(j, j + 2);
                    break;
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.makeGood("abBAcC"));
    }
}