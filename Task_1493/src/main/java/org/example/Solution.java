package org.example;


import java.util.ArrayList;

public class Solution {
    public int longestSubarray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        int length = nums.length;
        int currentLength = 0;
        int currentNulls = 0;
        for (int i = 0; i < length; i++) {
            int currentElem = nums[i];
            if (currentElem == 1) {
                currentLength++;
                currentNulls = 0;
            } else {
                if (currentNulls == 0) {
                    currentNulls++;
                    list.add(currentLength);
                    currentLength = 0;
                } else {
                    if (list.size() == 1) {
                        max = Math.max(max, list.get(0) - 1);
                    } else {
                        int currentSum = list.get(0);
                        for (int j = 1; j < list.size(); j++) {
                            currentSum += list.get(j);
                            max = Math.max(max, currentSum);
                            currentSum -= list.get(j-1);
                        }
                        list = new ArrayList<>();
                        currentNulls = 0;
                    }
                }
            }
        }
        list.add(currentLength);
        if (list.size() == 1) {
            max = Math.max(max, list.get(0) - 1);
        } else {
            int currentSum = list.get(0);
            for (int j = 1; j < list.size(); j++) {
                currentSum += list.get(j);
                max = Math.max(max, currentSum);
                currentSum -= list.get(j-1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = new int[]{1,1,1};
        int[] arr2 = new int[]{1,1,1,0,1,1,0,1,0,0,0};

        System.out.println(sol.longestSubarray(arr1));
        System.out.println(sol.longestSubarray(arr2));
    }
}