package org.example;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] answer = new int[2];
        Element[] elems = new Element[length];
        for (int i = 0; i < length; i++) {
            Element elem = new Element(nums[i], i);
            elems[i] = elem;
        }

        Arrays.sort(elems, (Element a, Element b) -> {
            int val1 = a.value;
            int val2 = b.value;
            return Integer.compare(val1, val2);
        });

        int left = 0;
        int right = length - 1;

        while(left < right) {
            int leftNum = elems[left].value;
            int rightNum = elems[right].value;

            if (leftNum + rightNum == target) {
                answer[0] = elems[left].index;
                answer[1] = elems[right].index;
                return answer;
            }

            if (leftNum + rightNum < target) {
                left++;
            } else {
                right--;
            }
        }


        return null;
    }

    static class Element {
        int value;
        int index;
        public Element(int value, int index) {
            this.value = value;
            this.index = index;
        }


    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}