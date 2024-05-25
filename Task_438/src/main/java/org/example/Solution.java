package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private static final int NUMBER_OF_ENGLISH_LETTERS = 26;
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();

        int[] sCharsCounter = new int[NUMBER_OF_ENGLISH_LETTERS];
        int[] pCharsCounter = new int[NUMBER_OF_ENGLISH_LETTERS];

        for (int i = 0; i < p.length(); i++) {
            sCharsCounter[s.charAt(i) - 'a']++;
            pCharsCounter[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (isEquals(sCharsCounter, pCharsCounter)) {
                result.add(i);
            }
            if (i + p.length() < s.length()) {
                sCharsCounter[s.charAt(i) - 'a']--;
                sCharsCounter[s.charAt(i + p.length()) - 'a']++;
            }
        }

        return result;
    }

    private boolean isEquals(int[] s, int[] p) {
        for (int i = 0; i < NUMBER_OF_ENGLISH_LETTERS; i++) {
            if (s[i] != p[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.findAnagrams("abab", "ab");
    }
}