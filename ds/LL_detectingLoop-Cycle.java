
//https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
// blog on the topic, with all possible approaches: https://blog.ostermiller.org/find-loop-singly-linked-list

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    
    
    Node slow = head;
    Node fast = head;
    
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        
        if(slow==fast){
            return true;
        }
        
    }
    return false;
    
    
    

}
