package org.example;

public class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        int length = chars.length;
        int answer = 0;
        int index = 0;
        int modifiedIndex = 0;
        char prev = chars[index++];
        int counter = 1;
        while(index < length) {
            char ch = chars[index++];
            if (ch != prev) {
                int digits = getNumbersOfDigits(counter);
                String add = Integer.toString(counter);
                chars[modifiedIndex++] = prev;
                if (counter != 1) {
                    answer += digits + 1;
                    for (int i = 0; i < add.length(); i++) {
                        chars[modifiedIndex++] = add.charAt(i);
                    }
                } else {
                    answer++;
                }

                counter = 1;
                prev = ch;
            } else {
                counter++;
            }
        }
        int digits = getNumbersOfDigits(counter);
        String add = Integer.toString(counter);
        chars[modifiedIndex++] = prev;
        if (counter != 1) {
            answer += digits + 1;
            for (int i = 0; i < add.length(); i++) {
                chars[modifiedIndex++] = add.charAt(i);
            }
        } else {
            answer++;
        }

        return answer;
    }

    private int getNumbersOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + getNumbersOfDigits(n / 10);
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
}