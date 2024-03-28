package org.example;

import java.util.Arrays;

public class SolutionFaster {
    private static final int NUMBER_OF_CHARS_IN_ENGLISH = 27;
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[NUMBER_OF_CHARS_IN_ENGLISH];

        for (char c : magazine.toCharArray()) {
            counter[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            int index = c - 'a';
            if (counter[index] == 0) {
                return false;
            }
            counter[index]--;
        }

        return true;
    }
}
