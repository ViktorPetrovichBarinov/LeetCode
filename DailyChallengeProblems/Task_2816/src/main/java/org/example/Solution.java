package org.example;


import java.util.ArrayList;

public class Solution {
    public ListNode doubleIt(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode current = head;
        while(current != null) {
            list.add(current.val);
            current = current.next;
        }

        int add = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            int doub = list.get(i) * 2;
            list.set(i, doub % 10 + add);
            if (doub >= 10) {
                add = 1;
            } else {
                add = 0;
            }
        }

        ListNode answer;
        if (add == 0) {
            answer = new ListNode(list.get(0));
            current = answer;
            for (int i = 1; i < list.size(); i++) {
                current.next = new ListNode(list.get(i));
                current = current.next;
            }

        } else {
            answer = new ListNode(1);
            current = answer;
            for (int i = 0; i < list.size(); i++) {
                current.next = new ListNode(list.get(i));
                current = current.next;
            }
        }
        return answer;
    }




    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.doubleIt(new ListNode(1, new ListNode(8, new ListNode(9))));

    }
}