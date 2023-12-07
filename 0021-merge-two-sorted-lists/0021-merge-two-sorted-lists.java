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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res=null, temp=null;
        while (list1!=null&&list2!=null) {
            if (list1.val<list2.val) {
                temp=list1;
                list1=list1.next;
                if (res==null) res=temp;
            }
            else {
                temp=list2;
                list2=list2.next;
                if (res==null) res=temp;
            }
            if (list2!=null&&list1!=null) {
                temp.next= (list1.val<list2.val) ? list1:list2;
                if (res==null) res=temp;
                temp=temp.next;
            }
        }
        if (list2==null&&list1==null) return res;
        if (res!=null) {
            if (list1==null) temp.next=list2;
            else temp.next=list1;
        } 
        else if (list1==null) res=list2; 
            else res=list1;
        return res;
    }
}