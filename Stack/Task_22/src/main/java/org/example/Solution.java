package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    List<String> res = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        help("(", n, 1, 0);
        return res;
    }

    public void help(String current, int n, int open, int close) {
        if (close == n) {
            res.add(current);
        } else {
            if (open < n) {
                help(current + "(", n, open + 1, close);
            } if (close < open) {
                help(current + ")", n, open, close + 1);
            }
        }
    }




    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.generateParenthesis(3));
    }
}
