package org.example;

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int studentsThatPreferSquare = 0;
        int studentsThatPreferCircle = 0;

        int studentsLength = students.length;
        int sandwichesLength = sandwiches.length;

        for (int i = 0; i < studentsLength; i++) {
            if (students[i] == 0) {
                studentsThatPreferCircle++;
            } else {
                studentsThatPreferSquare++;
            }
        }

        for (int i = 0; i < sandwichesLength; i++) {
            if (sandwiches[i] == 0) {
                if (studentsThatPreferCircle > 0) {
                    studentsThatPreferCircle--;
                } else {
                    break;
                }
            }
            if (sandwiches[i] == 1) {
                if (studentsThatPreferSquare > 0) {
                    studentsThatPreferSquare--;
                } else {
                    break;
                }
            }
        }
        return studentsThatPreferSquare + studentsThatPreferCircle;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }
}