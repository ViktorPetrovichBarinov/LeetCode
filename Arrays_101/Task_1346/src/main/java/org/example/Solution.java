package org.example;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[i] == arr[j] * 2 && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}