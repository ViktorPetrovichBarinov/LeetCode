package org.example;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftIndex = 0;
        int rightIndex = 0;
        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int current = 0;
        while(rightIndex < length) {
            Character rightChar = s.charAt(rightIndex);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, 2);
                current = rightIndex - leftIndex;
                max = Math.max(max, current);
                while(true) {
                    Character leftChar = s.charAt(leftIndex);
                    int leftCharCounter = map.get(leftChar);
                    if (leftCharCounter == 2) {
                        map.put(leftChar, 1);
                        leftIndex++;
                        break;
                    } else {
                        map.remove(leftChar);
                        leftIndex++;
                    }

                }
            } else {
                map.put(rightChar, 1);
            }
            rightIndex++;
        }
        current = rightIndex - leftIndex;
        max = Math.max(max, current);
        return max;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring(" "));
    }
}