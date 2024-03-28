package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            answer.add("");
        }


        for (int i = 2; i < n; i += 3){
            answer.set(i, "Fizz");
        }
        for (int i = 4; i < n; i += 5) {
            answer.set(i, answer.get(i) + "Buzz");
        }
        for (int i = 0; i < n; i++) {
            if (Objects.equals(answer.get(i), "")) {
                answer.set(i, Integer.toString(i + 1));
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> ans = solution.fizzBuzz(15);
        for (String str : ans) {
            System.out.println(str);
        }
    }
}