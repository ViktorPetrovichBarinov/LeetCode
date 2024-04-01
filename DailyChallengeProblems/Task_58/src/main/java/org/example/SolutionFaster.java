package org.example;

public class SolutionFaster {
    public int lengthOfLastWord(String s) {
        int answer = 0;
        int i = s.length() - 1;
        while(s.charAt(i) == ' ') {
            i--;
        }
        while(i != -1 && s.charAt(i) != ' ') {
            answer++;
            i--;
        }
        return answer;
    }

    public static void main(String[] args) {
        SolutionFaster sol = new SolutionFaster();
        System.out.println(sol.lengthOfLastWord("a"));
    }
}
