package org.example;

import java.util.Arrays;

public class Solution {
    private static final int NUMBER_OF_CHARS_IN_ENGLISH = 27;
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomDictionary = new int[NUMBER_OF_CHARS_IN_ENGLISH];
        int[] magazineDictionary = new int[NUMBER_OF_CHARS_IN_ENGLISH];

        Arrays.fill(ransomDictionary, 0);
        Arrays.fill(magazineDictionary, 0);

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            ransomDictionary[index]++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            int index = magazine.charAt(i) - 'a';
            magazineDictionary[index]++;
        }

        for (int i = 0; i < NUMBER_OF_CHARS_IN_ENGLISH; i++) {
            if (ransomDictionary[i] > magazineDictionary[i]) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.canConstruct("a", "b"));
        System.out.println(sol.canConstruct("aa", "ab"));
        System.out.println(sol.canConstruct("aa", "aab"));
    }
}