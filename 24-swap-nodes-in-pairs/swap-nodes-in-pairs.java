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
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode();
        ListNode prev=dummy;
        dummy.next=head;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            prev.next=temp.next;
            temp.next=temp.next.next;
            prev=prev.next;
            prev.next=temp;
            prev=temp;
            temp=temp.next;
        }
        return dummy.next;
    }
}