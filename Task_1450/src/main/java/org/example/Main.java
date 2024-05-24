package org.example;

public class Main {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int answer = 0;
        for (int i = 0; i < startTime.length; i++){
            if (queryTime <= endTime[i] && queryTime >= startTime[i]) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}