package org.example;

import java.util.HashMap;

public class Solution {
    public int slidingWindow(int[] nums, int k) {
        int length = nums.length;
        int leftIndex = 0;
        int rightIndex = 0;
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();


        while(rightIndex < length) {
            int rightNumber = nums[rightIndex];
            int rightNumberCounter = map.getOrDefault(rightNumber, 0);
            map.put(rightNumber, ++rightNumberCounter);

            while(map.size() > k) {
                int leftNumber = nums[leftIndex];
                int leftNumberCounter = map.get(leftNumber);
                map.put(leftNumber, --leftNumberCounter);
                if (map.get(leftNumber) == 0) {
                    map.remove(leftNumber);
                }
                leftIndex++;
            }

            counter += rightIndex - leftIndex + 1;
            rightIndex++;
        }
        return counter;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindow(nums, k) - slidingWindow(nums, k - 1);
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.subarraysWithKDistinct(new int[] {1,2,1,3,4}, 3));
    }
}