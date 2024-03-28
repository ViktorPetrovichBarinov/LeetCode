package org.example;

import java.util.HashMap;

public class SolutionFaster {
    public int maxSubarrayLength(int[] nums, int k) {
        int length = nums.length;
        int start = 0;
        int end = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (end < length) {
            int currentElement = nums[end];
            int count = map.getOrDefault(currentElement, 0);
            if (count == k) {
                result = Math.max(end - start, result);
                int startNumber = nums[start];
                while (startNumber != currentElement) {
                    int cnt = map.get(startNumber);
                    map.put(startNumber, --cnt);
                    startNumber = nums[++start];
                }
                map.put(nums[start++],k);
            } else {
                map.put(currentElement, ++count);
            }
            end++;
        }
        return Math.max(end - start, result);
    }

    public static void main(String[] args) {
        SolutionFaster sol = new SolutionFaster();
        System.out.println(sol.maxSubarrayLength(new int[]{5,5,5,5,5,5,5}, 4));
    }
}
