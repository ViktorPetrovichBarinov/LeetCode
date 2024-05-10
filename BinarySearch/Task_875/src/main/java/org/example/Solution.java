package org.example;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = -1;
        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isLessThanH(piles, h, middle)) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return low;
    }

    public boolean isLessThanH(int[] piles, int h, int speed) {
        int turnCounter = 0;
        for (int i = 0; i < piles.length; i++) {
            int element = piles[i];
            if (element % speed == 0) {
                turnCounter += element / speed;
            } else {
                turnCounter += element / speed + 1;
            }

            if (turnCounter > h) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minEatingSpeed(new int[] {312884470}, 968709470));;
    }
}