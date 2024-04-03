package org.example;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int length = nums.length;
        LinkedList<Integer> answer = new LinkedList<>();
        boolean[] hist = new boolean[length + 1];

        for (int i = 0; i < length; i++) {
            if (!hist[nums[i]]) {
                hist[nums[i]] = true;
            } else {
                answer.add(nums[i]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
}