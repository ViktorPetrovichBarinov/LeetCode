package org.example;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Difference> stack = new Stack<>();
        int length = temperatures.length;
        int[] answer = new int[length];
        stack.add(new Difference(temperatures[0], 0));
        for (int i = 1; i < length; i++) {
            int current = temperatures[i];

            while(!stack.isEmpty()) {
                Difference difference = stack.peek();
                if (difference.val < current) {
                    answer[difference.index] = i - difference.index;
                } else {
                    stack.add(new Difference(current, i));
                    break;
                }
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.add(new Difference(current, i));
            }

        }
        return answer;
    }

    public static class Difference{
        int val;
        int index;
        Difference(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.dailyTemperatures(new int[]{30,60,90})));
    }
}