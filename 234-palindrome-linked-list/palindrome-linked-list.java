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
        if(head==null||head.next==null){
            return head;
        }
        ListNode nnode=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return nnode;
    }
    public ListNode findmiddle(ListNode head){
        ListNode hare=head;
        ListNode turtle=head;
        while(hare.next!=null&&hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode mid=findmiddle(head);
        ListNode secondhalf=reverse(mid.next);
        ListNode firsthalf=head;
        while(secondhalf!=null){
            if(secondhalf.val!=firsthalf.val){
                return false;
            }
            secondhalf=secondhalf.next;
            firsthalf=firsthalf.next;
        }
        return true;

        
    }
}