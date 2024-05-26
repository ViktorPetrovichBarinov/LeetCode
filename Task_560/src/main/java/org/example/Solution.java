package org.example;

import java.util.HashMap;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        // <summary, number of meeting>
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        map.put(0, 1);//empty subarray [] (without elements)

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                counter += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return counter;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.checkInclusion(new int[]{1,2,3}, 3));
    }
}