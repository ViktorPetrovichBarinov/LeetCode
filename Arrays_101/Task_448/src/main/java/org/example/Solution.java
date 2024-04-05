package org.example;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        boolean[] hist = new boolean[length + 1];
        for (int i = 0; i < length; i++) {
            hist[nums[i]] = true;
        }

        LinkedList<Integer> answer = new LinkedList<>();
        for (int i = 1; i <= length; i++) {
            if (!hist[i]) {
                answer.add(i);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[] {1,1};

        System.out.println(sol.findDisappearedNumbers(nums));
    }
}