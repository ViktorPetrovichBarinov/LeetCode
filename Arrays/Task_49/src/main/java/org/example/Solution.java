package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private static final Integer NUMBER_OF_ENGLISH_LETTERS = 27;
    public List<List<String>> groupAnagrams(String[] strs) {
        int length = strs.length;
        HashMap<Hashing, List<String>> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            int[] anagram = anagram(strs[i]);
            List<String> currentList;
            Hashing currentHash = new Hashing(anagram);
            if (!map.containsKey(currentHash)) {
                currentList = new ArrayList<>();
                currentList.add(strs[i]);
                map.put(currentHash, currentList);
            } else {
                currentList = map.get(currentHash);
                currentList.add(strs[i]);
                map.put(currentHash, currentList);
            }
        }
        List<List<String>> answer = new ArrayList<>();
        for (Hashing key : map.keySet()) {
            answer.add(map.get(key));
        }
        return answer;
    }

    public class Hashing {
        private int[] arr;
        public Hashing(int[] arr) {
            this.arr = arr;
        }

        @Override
        public int hashCode() {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hashing hashing = (Hashing) o;
            return Arrays.equals(this.arr, hashing.arr);
        }
    }


    public int[] anagram(String str) {
        int length = str.length();
        int[] anagram = new int[NUMBER_OF_ENGLISH_LETTERS];

        for (int i = 0; i < length; i++) {
            anagram[str.charAt(i) - 'a']++;
        }
        return anagram;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));

    }
}