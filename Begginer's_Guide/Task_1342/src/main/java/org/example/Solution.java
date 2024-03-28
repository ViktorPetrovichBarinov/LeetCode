package org.example;

public class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num != 0) {
            steps++;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
        }
        return steps;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.numberOfSteps(0));
    }
}