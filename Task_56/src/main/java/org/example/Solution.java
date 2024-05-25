package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[][] merge(int[][] intervals) {
        int lowerBound = 0;
        int upperBound = 10002;

        Arrays.sort(intervals, (a,b) -> {
            int startA = a[0];
            int startB = b[0];
            return Integer.compare(startA, startB);
        });

        ArrayList<int[]> intervalsList = new ArrayList<>(Arrays.asList(intervals));
        for (int i = 0; i < intervalsList.size() - 1; i++) {
            int startCurr = intervalsList.get(i)[0];
            int endCurr = intervalsList.get(i)[1];
            int startNext = intervalsList.get(i+1)[0];
            int endNext = intervalsList.get(i+1)[1];

            if (endCurr >= startNext) {
                intervalsList.remove(i + 1);
                intervalsList.remove(i);
                intervalsList.add(i, new int[]{startCurr, Math.max(endCurr, endNext)});
                i--;
            }
        }

        System.out.println(Arrays.deepToString(intervals));
        return intervalsList.toArray(new int[intervalsList.size()][]);
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.deepToString(sol.merge(new int[][]{{1, 3}, {8, 10}, {2, 6}, {15, 18}})));
    }
}