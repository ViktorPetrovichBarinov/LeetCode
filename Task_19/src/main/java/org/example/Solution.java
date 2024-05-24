package org.example;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        int length = getLength(head);
        int prevIndex = length - n;
        if (prevIndex == 0) {
            return head.next;
        }
        ListNode current = head;
        int currentIndex = 1;
        while(currentIndex != prevIndex){
            currentIndex++;
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

    private int getLength(ListNode head) {
        ListNode current = head;
        int length = 0;
        while(current!=null) {
            length++;
            current = current.next;
        }
        return length;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.removeNthFromEnd(new ListNode(1, new ListNode(2)), 2);
    }
}