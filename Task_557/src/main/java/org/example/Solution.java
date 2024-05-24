package org.example;

public class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < split.length; i++) {
            String str = split[i];
            for (int j = str.length() - 1;  j >= 0; j--) {
                sb.append(str.charAt(j));
            }
            if (i == split.length - 1) {
                return sb.toString();
            } else {
                sb.append(" ");
            }


        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}