package org.example;

public class Solution {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = -1;
        for (int i = 0; i < accounts.length; i++) {
            int currentCustomerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, currentCustomerWealth);
        }
        return maxWealth;//will change
    }
}