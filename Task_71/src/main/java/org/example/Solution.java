package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {

        String[] split = path.split("/");
        LinkedList<String> queue = new LinkedList<>();
        for (String s : split) {
            if (s.equals("..")) {
                if (!queue.isEmpty()){
                    queue.removeFirst();
                }
            } else if (s.equals(".")){
                continue;
            } else if (!s.isEmpty()) {
                queue.addFirst(s);
            }
        }
        StringBuilder sb = new StringBuilder("/");
        while (!queue.isEmpty()) {
            sb.append(queue.removeLast()).append("/");
        }

        if (sb.length() != 1) {
            sb.deleteCharAt(sb.length() - 1);
        }


        return sb.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
//        System.out.println(sol.simplifyPath("/"));
//        System.out.println(sol.simplifyPath("//"));
//        System.out.println(sol.simplifyPath("/home/"));
//        System.out.println(sol.simplifyPath("/home//foo/"));
//        System.out.println(sol.simplifyPath("/home/user/Documents/../Pictures"));
        System.out.println(sol.simplifyPath("/.../a/../b/c/../d/./"));
        System.out.println(sol.simplifyPath("/../"));
    }
}