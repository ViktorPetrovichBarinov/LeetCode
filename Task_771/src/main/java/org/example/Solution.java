package org.example;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] myStones = new int[255];
        for (int i = 0; i < stones.length(); i++) {
            myStones[stones.charAt(i)]++;
        }
        int answer = 0;
        for (int i = 0; i < jewels.length(); i++) {
            answer+=myStones[jewels.charAt(i)];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}