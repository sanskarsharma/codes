

//https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
// dimag toot gaya ek doubt k karan

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    
    Node temp = head;
    Node newHead = head;
    while(temp!=null){
        Node orig = temp.prev;
        temp.prev = temp.next;
        temp.next = orig;
        newHead = temp;
        temp = temp.prev;
    }
    return newHead;
    
    
    
    
    

}
