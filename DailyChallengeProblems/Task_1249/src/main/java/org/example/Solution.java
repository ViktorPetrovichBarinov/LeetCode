package org.example;

import java.util.Stack;

public class Solution {

    /**
     *  В итоговой строке в любом суффиксе количетсво открывающихся скобок
     *  больше или ровно количеству закрывающихся скобок.
     *  Аналогичное правило действует и для суффиксов.
     *  Проверяем эти два инварианта.
     */
    public String minRemoveToMakeValid(String s) {
        StringBuilder firstPassage = new StringBuilder();
        int length = s.length();
        int availableOpenBrackets = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                availableOpenBrackets++;
                firstPassage.append(currentChar);
            } else if (currentChar == ')') {
                if (availableOpenBrackets != 0) {
                    availableOpenBrackets--;
                    firstPassage.append(currentChar);
                }
            } else {
                firstPassage.append(currentChar);
            }
        }

        int availableCloseBrackets = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = firstPassage.length() - 1; i >= 0; i--) {
            char currentChar = firstPassage.charAt(i);
            if (currentChar == ')') {
                availableCloseBrackets++;
                answer.append(currentChar);
            } else if (currentChar == '(') {
                if (availableCloseBrackets != 0) {
                    availableCloseBrackets--;
                    answer.append(currentChar);
                }
            } else {
                answer.append(currentChar);
            }
        }

        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minRemoveToMakeValid("())()((("));
    }
}