package org.example;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            int a;
            int b;
            switch (token) {
                case "*" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                    break;
                case "+" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a + b);
                    break;
                case "-" :
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a - b);
                    break;
                case "/" :
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;
                default :
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}