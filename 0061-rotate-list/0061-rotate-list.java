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
        if(head == null)
            return null;
        
        ListNode run = head;
        ListNode tail = null;
        int len = 0;
        
        while(run != null){
            tail = run;
            run = run.next;
            len++;
        }
        tail.next = head;
        
        k %= len;
        k = len - k -1;
        run = head;
        
        while(k > 0){
            run = run.next;
            k--;
        }
        tail = run.next;
        run.next = null;
        
        return tail;
    }
}