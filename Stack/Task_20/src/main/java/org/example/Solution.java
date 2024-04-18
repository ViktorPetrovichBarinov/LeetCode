package org.example;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (current == ')' && stack.pop() != '(') {
                    return false;
                }
                if (current == ']' &&  stack.pop() != '[') {
                    return false;
                }
                if (current == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isValid("()"));
    }
}