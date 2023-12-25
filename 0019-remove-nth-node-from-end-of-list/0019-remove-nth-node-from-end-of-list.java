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
    static ListNode dummy;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        dummy=head;
        size=0;
        while (dummy!=null) {
            ++size;
            dummy=dummy.next;
        }
        dummy=head;
        while (--size>n) {
            dummy=dummy.next;
        }
        if (size==n) {
            dummy.next=dummy.next.next;
        }
        else head=dummy.next;
        return head;
    }
}