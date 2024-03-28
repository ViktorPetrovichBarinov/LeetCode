package org.example;

public class Solution {
    public int findNumbers(int[] nums) {
        int numberOfEvenDigitsNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (getNumberOfDigits(nums[i]) % 2 == 0) {
                numberOfEvenDigitsNumber++;
            }
        }
        return numberOfEvenDigitsNumber;
    }

    private int getNumberOfDigits(int number) {
        int numberOfDigits = 0;
        while(number!=0) {
            numberOfDigits++;
            number /= 10;
        }
        return numberOfDigits;
    }

//    public static void main(String[] args) {
////        Solution sol = new Solution();
////        System.out.println(sol.findNumbers(new int[]{12,345,2,6,7896}));
////        System.out.println(sol.findNumbers(new int[]{555,901,482,1771}));
////    }
}