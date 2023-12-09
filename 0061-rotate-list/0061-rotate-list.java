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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0) return head;
        ArrayList<ListNode> a =new ArrayList<>();
        a.add(head);
        ListNode t = head.next;
        while(t!=null) {
            a.add(t);
            t=t.next;
        }
        int s=a.size();
        ListNode q=a.get(s-k%s-1), tail=a.get(s-1);
        tail.next=head;
        head=q.next;
        q.next=null;
        return head;
    }
}