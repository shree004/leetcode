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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode node=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=node;
            node=head;
            head=temp;
        }
        return node;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        while(newHead!=null){
            if(head.val!=newHead.val)return false;
            newHead=newHead.next;
            head=head.next;
        }
        return true;
    }
}