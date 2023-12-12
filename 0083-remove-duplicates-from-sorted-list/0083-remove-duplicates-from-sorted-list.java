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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dum= head;
        while (head!=null) {
            if (head.next==null||head.next.val!=head.val)
            head=head.next;
            else head.next=head.next.next;            
        }
        return dum;
    }
}