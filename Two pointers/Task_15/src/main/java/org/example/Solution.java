package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static final int MAX_INTEGER = 100000;
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer  = new ArrayList<>();
        Arrays.sort(nums);
        int[] hist = new int[MAX_INTEGER * 2 + 1];
        for (int i = 0; i < nums.length; i++) {
            hist[nums[i] + MAX_INTEGER]++;
        }

        for (int i = 0; i < nums.length;) {
            int leftNum = nums[i];
            for (int j = i + 1; j < nums.length;) {
                int midNum = nums[j];
                int rightNum = 0 - leftNum - midNum;
                if (rightNum < midNum || rightNum > 100000) {
                    j++;
                    continue;
                } else if (leftNum == rightNum && rightNum == midNum && hist[rightNum + MAX_INTEGER] >= 3) {
                    answer.add(Arrays.asList(leftNum, midNum, rightNum));
                } else if (leftNum != rightNum && rightNum == midNum && hist[rightNum + MAX_INTEGER] >= 2) {
                    answer.add(Arrays.asList(leftNum, midNum, rightNum));
                } else if (leftNum != rightNum && rightNum != midNum && hist[rightNum + MAX_INTEGER] >= 1){
                    answer.add(Arrays.asList(leftNum, midNum, rightNum));
                }
                j++;
                while(j < nums.length) {
                    if (nums[j] == midNum) {
                        j++;
                    } else {
                        break;
                    }
                }
            }
            i++;
            while(i < nums.length) {
                if (nums[i] == leftNum) {
                    i++;
                } else {
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.threeSum(new int[]{1, 1, -2}));
    }
}