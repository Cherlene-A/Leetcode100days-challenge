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
        if(head== null || head.next == null || k==0) 
        return head;
        ListNode temp = head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int rotation = k%length;        
for(int i =0;i<rotation;i++){
    ListNode last = head, prev = null;
    while(last.next != null){
 prev = last;
 last = last.next;
    }
    last.next = head;
    prev.next = null;
    head = last;
}
return head;
    }
}