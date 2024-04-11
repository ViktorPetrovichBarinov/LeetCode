package org.example;

public class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder(num);
        while(k > 0) {
            changeString(sb);
            k--;
        }
        return sb.toString();
    }
    int i = 1;
    public void changeString(StringBuilder str) {
        if (str.length() == 1) {
            str.deleteCharAt(0);
            str.append("0");
            return;
        }
        if (i < 1) i = 1;
        for (;i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);
            if (prev > curr) {
                str.deleteCharAt(i - 1);
                if (i - 1 == 0) {
                    while (str.length() > 1 && str.charAt(i - 1) == '0') {
                        str.deleteCharAt(i - 1);
                    }
                }
                i--;
                break;
            }
            if (i == str.length() - 1) {
                str.deleteCharAt(i);
                i -= 2;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeKdigits("112", 1));

        StringBuilder sb = new StringBuilder("a");
        sb.delete(0,1);
        System.out.println(sb.toString());
    }
}