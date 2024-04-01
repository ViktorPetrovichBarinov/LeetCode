package org.example;

public class Solution {
    public int lengthOfLastWord(String s) {
        int currentWordLength = 0;
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                currentWordLength++;
            } else {
                if (i != 0 && s.charAt(i - 1) != ' '){
                    answer = currentWordLength;
                    currentWordLength = 0;
                }
            }
        }
        if (currentWordLength != 0) {
            return currentWordLength;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy"));
    }
}