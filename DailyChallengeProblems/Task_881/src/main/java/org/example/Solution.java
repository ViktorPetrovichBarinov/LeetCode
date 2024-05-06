package org.example;

import java.util.Arrays;

public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] hist = new int[3 * 10000 + 1];
        for (int i = 0; i < people.length; i++) {
            hist[people[i]]++;
        }
        int index = 0;
        for (int i = 0; i < hist.length; i++) {
            for (int j = 0; j < hist[i]; j++) {
                people[index++] = i;
            }
        }
        int left = 0;
        int right = people.length - 1;
        int answer = 0;

        while(left <= right) {
            int currentWeight = limit;
            currentWeight -= people[right];

            if (left < right && currentWeight >= people[left]) {
                left++;
            }
            right--;
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numRescueBoats(new int[]{3, 2, 2, 1}, 3));
    }
}