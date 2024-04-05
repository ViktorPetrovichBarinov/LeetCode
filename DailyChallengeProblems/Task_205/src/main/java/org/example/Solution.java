package org.example;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] changeStoT = new char[128];
        char[] changeTtoS = new char[128];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char currentCharS = s.charAt(i);
            char currentCharT = t.charAt(i);
            if (changeStoT[currentCharS] == 0) {
                changeStoT[currentCharS] = currentCharT;
            } else if (changeStoT[currentCharS] != currentCharT){
                return false;
            }

            if (changeTtoS[currentCharT] == 0) {
                changeTtoS[currentCharT] = currentCharS;
            } else if (changeTtoS[currentCharT] != currentCharS) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isIsomorphic("badc", "baba"));
    }
}