package org.example;

import java.util.*;

public class Solution1 {
    public int longestConsecutive(int[] nums) {
        //val / isChecked
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, false);
        }


        int max = 0;
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            int currentLength = 1;
            if (map.get(entry.getKey())) {
                continue;
            }
            map.put(entry.getKey(), true);
            int up = entry.getKey() + 1;
            int down = entry.getKey() - 1;

            while(map.containsKey(up)) {
                map.put(up, true);
                currentLength++;
                up++;
            }

            while(map.containsKey(down)) {
                map.put(down, true);
                currentLength++;
                down--;
            }

            max = Math.max(max, currentLength);
        }

        return max;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.longestConsecutive(new int[]{0 ,-1}));
    }
}
