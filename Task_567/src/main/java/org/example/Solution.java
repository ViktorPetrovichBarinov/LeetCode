package org.example;

public class Solution {
    private static final int NUMBER_OF_ENGLISH_LETTERS = 27;
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }
        int[] hist1 = new int[NUMBER_OF_ENGLISH_LETTERS];
        int[] hist2 = new int[NUMBER_OF_ENGLISH_LETTERS];

        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            int index = ch - 'a';
            hist1[index]++;
        }

        for (int i = 0; i < s1.length() - 1; i++) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            hist2[index]++;
        }

        for (int i = s1.length() - 1; i < s2.length(); i++){
            char ch = s2.charAt(i);
            int index = ch - 'a';
            hist2[index]++;

            if (isEquals(hist1, hist2)) {
                return true;
            } else {
                ch = s2.charAt(i - s1.length() + 1);
                index = ch - 'a';
                hist2[index]--;
            }
        }



        return false;
    }

    private boolean isEquals(int[] hist1, int[] hist2) {
        for (int i = 0; i < hist1.length; i++){
            if (hist1[i] != hist2[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.checkInclusion("ab", "eiboooo"));
    }
}