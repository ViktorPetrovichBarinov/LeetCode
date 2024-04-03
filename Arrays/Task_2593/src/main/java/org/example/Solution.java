package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public class Elem {
        private int value;
        private int index;
        public Elem(int value, int index) {
            this.value = value;
            this.index = index;
        }


    }

    public long findScore(int[] nums) {
        int length = nums.length;
        Elem[] elems = new Elem[length];
        boolean[] isMarked = new boolean[length];
        for (int i = 0; i < length; i++) {
            elems[i] = new Elem(nums[i], i);
        }

        Arrays.sort(elems, (i, j) -> i.value == j.value ? i.index - j.index : i.value - j.value);

        long score = 0;
        for (int i = 0; i < length; i++) {
            int currentIndex = elems[i].index;
            if (!isMarked[currentIndex]) {
                isMarked[currentIndex] = true;
                int currentVal = elems[i].value;
                score += currentVal;
                if (currentIndex > 0) {
                    isMarked[currentIndex - 1] = true;
                }
                if (currentIndex < length - 1) {
                    isMarked[currentIndex + 1] = true;
                }
            }
        }

        return score;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findScore(new int[]{2,3,5,1,3,2}));
    }
}