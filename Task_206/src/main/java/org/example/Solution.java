package org.example;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode answer = null;
        ListNode tmp = null;

        ListNode currentNode = head;
        while(currentNode != null) {
            answer = new ListNode(currentNode.val);
            answer.next = tmp;
            tmp = answer;
            currentNode = currentNode.next;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode ans = solution.reverseList(new ListNode(1, new ListNode(2, new ListNode(3))));
        while(ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}