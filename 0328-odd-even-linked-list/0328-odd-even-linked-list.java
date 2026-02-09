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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode t1 = odd;
        ListNode t2 = even;
        ListNode t = head;
        while(t!=null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;
            t2.next = t;
            if(t!=null) t = t.next;
            t2 = t2.next;
        }
        t1.next = even.next;
        return odd.next;
    }
    // public ListNode oddEvenList(ListNode head) {
    //     if (head == null) return null;

    //     ListNode d1 = new ListNode(-1); // odd position
    //     ListNode d2 = new ListNode(-1); // even position

    //     ListNode t1 = d1;
    //     ListNode t2 = d2;
    //     ListNode t = head;

    //     int pos = 1;

    //     while (t != null) {
    //         if (pos % 2 != 0) {
    //             t1.next = t;
    //             t1 = t1.next;
    //         } else {
    //             t2.next = t;
    //             t2 = t2.next;
    //         }
    //         t = t.next;
    //         pos++;
    //     }

    //     t1.next = d2.next;
    //     t2.next = null; 

    //     return d1.next;
    // }
}
