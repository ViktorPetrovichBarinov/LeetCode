package org.example;

public class Main {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = 0;
        ListNode answer = new ListNode((l1.val + l2.val) % 10) ;
        tmp = (l1.val + l2.val) / 10;
        l1 = l1.next;
        l2 = l2.next;
        ListNode current = answer;
        while(l1 != null && l2 != null) {
            current.next = new ListNode((l1.val + l2.val + tmp)%10);
            tmp = (l1.val + l2.val + tmp)/10;
            l1 = l1.next;
            l2 = l2.next;
            current = current.next;
        }
        if (l1 == null) {
            while(l2 != null) {
                current.next = new ListNode((l2.val + tmp) % 10);
                tmp = (l2.val + tmp) / 10;
                current = current.next;
                l2 = l2.next;
            }
        } else {
            while(l1 != null) {
                current.next = new ListNode((l1.val + tmp) % 10);
                tmp = (l1.val + tmp) / 10;
                current = current.next;
                l1 = l1.next;
            }
        }
        if (tmp == 1) {
            current.next = new ListNode(1);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}