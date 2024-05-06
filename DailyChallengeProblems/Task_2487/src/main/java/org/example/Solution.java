package org.example;


import java.util.ArrayList;

public class Solution {
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> listMax = new ArrayList<>();
        ArrayList<Integer> listInt = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            listInt.add(current.val);
            listMax.add(-1);
            current = current.next;
        }

        int max = 0;
        for (int i = listInt.size() - 1; i >= 0; i--) {
            listMax.set(i, max);
            max = Math.max(max, listInt.get(i));
        }
        ListNode answer = null;
        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i) >= listMax.get(i)) {
                if (answer == null) {
                    answer = new ListNode(listInt.get(i));
                    current = answer;
                } else {
                    current.next = new ListNode(listInt.get(i));
                    current = current.next;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        ListNode example = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8, null)))));
        Solution sol = new Solution();
        sol.removeNodes(example);


    }
}