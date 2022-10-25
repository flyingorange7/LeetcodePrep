/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode run1 = headA;
        ListNode run2 = headB;
        
        while(!(run1 == null && run2 == null)){
            if(run1 == run2)
                return run1;
            
            run1 = run1 == null ? headB : run1.next;
            run2 = run2 == null ? headA : run2.next;
        }
        
        return null;
    }
}