package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if (nums.length == 0) {
            return answer;
        }
        int length = nums.length;
        int start = -1;
        int prev = -1;
        String element = "";
        for (int i = 0; i < length; i++) {
            if (element.isEmpty()) {
                element = Integer.toString(nums[i]);
                prev = nums[i];
                start = nums[i];
            } else if (prev + 1 == nums[i]){
                prev++;
            } else {
                if (prev == start) {
                    answer.add(element);
                } else {
                    element += "->" + Integer.toString(prev);
                    answer.add(element);
                }
                element = Integer.toString(nums[i]);
                prev = nums[i];
                start = nums[i];
            }
        }

        if (prev == start) {
            answer.add(element);
        } else {
            element += "->" + Integer.toString(prev);
            answer.add(element);
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
}