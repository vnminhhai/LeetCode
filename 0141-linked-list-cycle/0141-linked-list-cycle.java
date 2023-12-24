/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    static ListNode f, s;
    public boolean hasCycle(ListNode head) {
        if (head==null) return false;
        s=f=head;
        while (f.next!=null&&f.next.next!=null) {
            s=s.next;
            f=f.next.next;
            if (f==s) return true;
        }
        return false;
    }
}