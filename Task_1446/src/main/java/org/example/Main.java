package org.example;

public class Main {
    public int maxPower(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int power = 1;
        int maxPower = 1;
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                power++;
            } else {
                maxPower = Math.max(maxPower, power);
                power = 1;
                ch = s.charAt(i);
            }
        }
        maxPower = Math.max(maxPower, power);
        return maxPower;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}