/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null)
            return null;
        
        Node dummy = new Node(-1, null, head, null);
        dfs(head);
        
        return dummy.next;
    }
    
    public Node dfs(Node head){
        if(head == null)
            return null;
        Node end = null;
        
        while(head != null){
            if(head.child != null){
                Node tail = dfs(head.child);
                
                Node next = head.next;
                
                head.next = head.child;
                head.child.prev = head;
                head.child = null;

                tail.next = next;
                if(next != null)
                    next.prev = tail;
            }
            end = head;
            head = head.next;
        }
        
        return end;
    }
}