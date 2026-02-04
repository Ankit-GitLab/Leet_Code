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
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(-1);
        d.next = head;

        ListNode p = d;
        ListNode t = head;

        while (t != null && t.next != null) {
            ListNode a = t;
            ListNode b = t.next;

            p.next = b;
            a.next = b.next;
            b.next = a;

            p = a;
            t = a.next;
        }

        return d.next;
    }
}
