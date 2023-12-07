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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode((l1.val+l2.val)%10);
        ListNode l4=l3;
        boolean c=((l1.val+l2.val)>9) ? true : false;
        while (l1.next!=null || l2.next!=null || c) {
            l1=(l1.next==null) ? new ListNode(0) : l1.next; l2=(l2.next==null) ? new ListNode(0) : l2.next;
            if (c) {
                l3.next= new ListNode((l1.val+l2.val+1)%10);
                l3=l3.next;
                c=((l1.val+l2.val+1)>9) ? true : false;
            } else {
                l3.next= new ListNode((l1.val+l2.val)%10);
                l3=l3.next;
                c=((l1.val+l2.val)>9) ? true : false;
            }
        }
        return l4;
    }
}