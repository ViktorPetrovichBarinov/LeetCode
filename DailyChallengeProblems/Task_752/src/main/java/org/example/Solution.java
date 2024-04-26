package org.example;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

import static java.lang.Character.*;

public class Solution {
    public int openLock(String[] deadends, String target) {
        boolean[] visited = new boolean[10000];
        Queue<Element> queue = new LinkedList<>();
        for (int i = 0; i < deadends.length; i++) {
            visited[Integer.parseInt(deadends[i])] = true;
        }

        if (Objects.equals(target, "0000")) {
            return 0;
        }
        if (!visited[0]) {
            queue.add(new Element("0000", 0));
        } else {
            return -1;
        }


        while (!queue.isEmpty()) {
            Element el = queue.poll();
            String str = el.string;
            int step = el.step;
            for (int i = 0; i < 4; i++) {
                char c = str.charAt(i);
                String newStr;
                //+
                if (c == '9') {
                    newStr = str.substring(0, i) + '0' + str.substring(i + 1);
                } else {
                    newStr = str.substring(0, i) + (char)(c + 1) + str.substring(i + 1);
                }
                if (newStr.equals(target)) {
                    return step + 1;
                } else {
                    if (!visited[Integer.parseInt(newStr)]) {
                        visited[Integer.parseInt(newStr)] = true;
                        queue.add(new Element(newStr, step + 1));
                    }
                }
                //-
                if (c == '0') {
                    newStr = str.substring(0, i) + '9' + str.substring(i + 1);
                } else {
                    newStr = str.substring(0, i) + (char)(c - 1) + str.substring(i + 1);
                }
                if (newStr.equals(target)) {
                    return step + 1;
                } else {
                    if (!visited[Integer.parseInt(newStr)]) {
                        visited[Integer.parseInt(newStr)] = true;
                        queue.add(new Element(newStr, step + 1));
                    }

                }
            }
        }
        return -1;
    }

    public static class Element {
        String string;
        int step;
        public Element(String string, int step) {
            this.string = string;
            this.step = step;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.openLock(new String[] {"0201","0101","0102","1212","2002"}, "0202"));
    }
}