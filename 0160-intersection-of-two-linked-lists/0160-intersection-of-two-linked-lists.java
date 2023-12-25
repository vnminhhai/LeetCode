/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    static ListNode hA,hB;
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        hA=headA; hB=headB;
        while (headB!=headA) {
            if (headA==null) headA=hB;
            else
            headA=headA.next;
            
            if (headB==null) headB=hA;
            else
            headB=headB.next;
        }
        return headA;
    }
}