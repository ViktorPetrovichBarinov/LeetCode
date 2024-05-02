package org.example;

public class Solution {
    public String reversePrefix(String word, char ch) {
        int length = word.length();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char currentChar = word.charAt(i);
            if (currentChar == ch) {
                str.append(currentChar);
                str.reverse();
                for (int j = i + 1; j < length; j++) {
                    str.append(word.charAt(j));
                }
                return str.toString();
            } else {
                str.append(currentChar);
            }
        }
        return word;
    }


    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    }
}