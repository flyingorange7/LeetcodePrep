public class ListNode{
    int val;
    ListNode prev;
    ListNode next;
    
    ListNode(int x){
        val = x;
    }
}

class MyLinkedList {
    int size;
    ListNode head;
    
    public MyLinkedList() {
        size = 0;
        head = new ListNode(-1);
    }
    
    public int get(int index) {
        if(index >= size)
            return -1;
        
        ListNode run = head;
        for(int i = 0; i <= index; i++){
            run = run.next;
        }
        
        return run.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size)
            return;
        
        size++;
        ListNode prev = head;
        ListNode ans = new ListNode(val);
        
        for(int i = 0; i < index; i++)
            prev = prev.next;
        
        ListNode next = prev.next;
        
        ans.next = next;
        if(next != null)
            next.prev = ans;
        
        prev.next = ans;
        ans.prev = prev;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size)
            return;
        
        size--;
        ListNode prev = head;
        for(int i = 0; i < index; i++)
            prev = prev.next;
        
        ListNode remove = prev.next;
        prev.next = remove.next;
        
        if(remove.next != null)
            remove.next.prev = prev;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */