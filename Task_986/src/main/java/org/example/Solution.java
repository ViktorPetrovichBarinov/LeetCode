package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int firstIndex = 0;
        int secondIndex = 0;

        ArrayList<int[]> result = new ArrayList<>();
        while(firstIndex < firstList.length && secondIndex < secondList.length) {
            int firstStart = firstList[firstIndex][0];
            int firstEnd = firstList[firstIndex][1];
            int secondStart = secondList[secondIndex][0];
            int secondEnd = secondList[secondIndex][1];

            if (firstEnd >= secondStart && secondStart >= firstStart) {
                if (firstEnd <= secondEnd) {
                    result.add(new int[]{secondStart, firstEnd});
                    firstIndex++;
                } else {
                    result.add(new int[]{secondStart, secondEnd});
                    secondIndex++;
                }
            } else if (secondEnd >= firstStart && firstStart >= secondStart) {
                if (firstEnd <= secondEnd) {
                    result.add(new int[]{firstStart, firstEnd});
                    firstIndex++;
                } else {
                    result.add(new int[]{firstStart, secondEnd});
                    secondIndex++;
                }
            } else if (secondStart > firstEnd){
                firstIndex++;
            } else if (firstStart > secondEnd) {
                secondIndex++;
            }
        }
        int[][] res = new int[result.size()][];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }

        return res;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] res = sol.intervalIntersection(new int[][]{{0, 2}, {5,10}, {13,23}, {24,25}},
                                new int[][]{{1,5}, {8,12}, {15,24}, {25,26}});
        System.out.println(Arrays.deepToString(res));
    }
}