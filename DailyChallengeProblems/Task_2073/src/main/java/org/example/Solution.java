package org.example;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int length = tickets.length;
        int time = 0;
        while(true) {
            for (int i = 0; i < length; i++) {
                if (tickets[i] != 0) {
                    time++;
                    tickets[i]--;
                }
                if (i == k && tickets[i] == 0) {
                    return time;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new  Solution();
        System.out.println(sol.timeRequiredToBuy(new int[]{5,1,1,1}, 0));
    }
}