package org.example;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode answer = new ListNode();
        ListNode current = answer;
        if (list1.val < list2.val) {
            answer.val = list1.val;
            list1 = list1.next;
        } else {
            answer.val = list2.val;
            list2 = list2.next;
        }

        while(list1 != null && list2 != null) {
            int val1 = list1.val;
            int val2 = list2.val;
            if (val1 < val2) {
                current.next = new ListNode(val1);
                current = current.next;
                list1 = list1.next;
            } else {
                current.next = new ListNode(val2);
                current = current.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            while(list2 != null) {
                current.next = new ListNode(list2.val);
                current = current.next;
                list2 = list2.next;
            }
        } else {
            while(list1 != null) {
                current.next = new ListNode(list1.val);
                current = current.next;
                list1 = list1.next;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode list1 = new ListNode(-9 , new ListNode(3));
        ListNode list2 = new ListNode(5, new ListNode(7));
        sol.mergeTwoLists(list1, list2);
    }
}