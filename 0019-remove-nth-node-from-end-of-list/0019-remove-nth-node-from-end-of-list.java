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
    static int size;
    static ListNode dummy, prev;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        dummy=head;
        size=0;
        while (dummy!=null) {
            ++size;
            dummy=dummy.next;
        }
        prev=head;
        while (--size>n) {
            prev=prev.next;
        }
        if (size==n) {
            prev.next=prev.next.next;
        }
        else head=prev.next;
        return head;
    }
}