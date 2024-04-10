package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int[] deckRevealedIncreasing(int[] deck) {
        int length = deck.length;
        ArrayList<Integer> indexes = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            indexes.add(i);
        }
        Arrays.sort(deck);
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[indexes.removeFirst()] = deck[i];
            if (!indexes.isEmpty()) {
                indexes.addLast(indexes.removeFirst());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.deckRevealedIncreasing(new int[]{17,13,11,2,3,5,7})));
    }
}