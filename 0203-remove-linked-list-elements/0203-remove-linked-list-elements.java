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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        
        ListNode run = dummy;
        while(run.next != null){
            if(run.next.val == val)
                run.next = run.next.next;
            else
                run = run.next;
        }
        
        return dummy.next;
    }
}