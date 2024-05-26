package org.example;

import java.util.ArrayList;

public class Solution {
    public int maxDistToClosest(int[] seats) {
        int firstNonEmptyIndex = -1;
        int lastNonEmptyIndex = -1;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                lastNonEmptyIndex = i;
                if (firstNonEmptyIndex == -1) {
                    firstNonEmptyIndex = i;
                }
            }
        }
        int max = 0;

        max = Math.max(max, firstNonEmptyIndex);
        max = Math.max(max, seats.length - 1 - lastNonEmptyIndex);

        ArrayList<Integer> indexesOfNonEmptySeats = new ArrayList<>();
        for (int i = firstNonEmptyIndex; i <= lastNonEmptyIndex; i++) {
            if (seats[i] == 1) {
                indexesOfNonEmptySeats.add(i);
            }
        }

        for (int i = 0; i < indexesOfNonEmptySeats.size() - 1; i++) {
            int curr = indexesOfNonEmptySeats.get(i);
            int next = indexesOfNonEmptySeats.get(i + 1);
            int diff = next - curr;
            int lengthToClosePerson = diff / 2;
            max = Math.max(max, lengthToClosePerson);
        }




        return max;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxDistToClosest(new int[]{0,1}));
    }
}