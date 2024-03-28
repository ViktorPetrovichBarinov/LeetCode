package org.example;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Solution {
    public ListNode middleNode(ListNode head) {
        int length = getListSize(head);
        int middle = length / 2;


        ListNode newHead = head;
        for (int i = 0; i < middle; i++) {
            newHead = newHead.next;
        }

        return newHead;
    }

    private int getListSize(ListNode head) {
        if (head.next == null) {
            return 1;
        }
        return 1 + getListSize(head.next);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode list2 = new ListNode();
        ListNode list1 = new ListNode(1, list2);
        System.out.println(sol.getListSize(list1));
    }
}