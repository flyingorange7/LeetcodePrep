/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        if(head == null){
            Node ans = new Node(insertVal);
            ans.next = ans;
            return ans;
        }
        
        if(head.next == head){
            head.next = new Node(insertVal, head);
            return head;
        }
        
        Node prev = head;
        Node curr = head.next;
        boolean flag = false;
        
        do{
            int val1 = prev.val;
            int val2 = curr.val;
            
            if(val1 < val2 && (insertVal <= val2 && insertVal >= val1))
                flag = true;
            else if(val1 > val2 &&(insertVal >= val1 || insertVal <= val2))
                flag = true;
            
            if(flag)
                break;
            
            prev = prev.next;
            curr = curr.next;
            
        }while(prev != head);
        
        prev.next = new Node(insertVal);
        prev.next.next = curr;
        
        return head;
    }
}