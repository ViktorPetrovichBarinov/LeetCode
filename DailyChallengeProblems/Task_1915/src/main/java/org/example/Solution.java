package org.example;

public class Solution {
    public long wonderfulSubstrings(String word) {
        int length = word.length();
        int answer = 0;
        int[] counter = new int[10];

        int currentOddNumber = 0;
        for (int i = 0; i < length; i++) {
            char current = word.charAt(i);
            if (counter[current - 'a'] == 0) {
                
            }
        }
    }


    public static void main(String[] args) {


    }
}