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
        if(head == null)
            return head;
        
        head = swap(head);
        
        return head;
    }
    
    public ListNode swap(ListNode head){
        if(head == null || head.next == null)
            return head;
        
        ListNode temp = head.next.next;
        ListNode curr = head.next;
        
        curr.next = head;
        head.next = swap(temp);
        
        return curr;
    }
}