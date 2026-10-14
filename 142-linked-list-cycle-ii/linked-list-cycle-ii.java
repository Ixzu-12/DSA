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
    public ListNode detectCycle(ListNode head) {
        // if(head==null||head.next==null){
        //     return head;
        // }
        ListNode turtle=head;

        ListNode hare=head;
        while(hare!=null&&hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                ListNode start=head;
                while(start!=turtle){
                    turtle=turtle.next;
                    start=start.next;
                    
                }
                return turtle;

            }
            
        }
        return null;
       

        
        
     
        


        
    }
}