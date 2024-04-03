package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], 2);
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) == 1 && !hashMap.containsKey(key - 1) && !hashMap.containsKey(key + 1)) {
                answer.add(key);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[] {1,3,5,3};
        System.out.println(sol.findLonely(nums));
    }
}