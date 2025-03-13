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
        ListNode s = head;
        ListNode f = head;
        if(s==null || s.next == null || s.next.next == null) return null;
        while(f.next != null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        
if(s==f){
    ListNode s2 = head;
    while(s!=s2){
        s=s.next;
        s2=s2.next;
    } 
     return s;    
    }
}
return null;        
}
    }

        
