package org.example;

import java.util.*;

public class Solution {
    //private static final int RANGE = 10_000;
    public int[] topKFrequent(int[] nums, int k) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int elem : nums) {
            if (map.putIfAbsent(elem, 1) != null) {
                map.put(elem, map.get(elem) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue()); // Сортировка по значению

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = list.get(list.size() - 1 - i).getKey();
        }
        //System.out.println(Arrays.toString(answer));


        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}