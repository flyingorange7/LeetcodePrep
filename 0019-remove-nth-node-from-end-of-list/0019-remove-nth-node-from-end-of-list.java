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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode run = dummy;
        for(int i = 0; i < n; i++)
            run = run.next;
        
        ListNode remove = dummy;
        while(run.next != null){
            run = run.next;
            remove = remove.next;
        }
        
        remove.next = remove.next.next;
        
        return dummy.next;
    }
}