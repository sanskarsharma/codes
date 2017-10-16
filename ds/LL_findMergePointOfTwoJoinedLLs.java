
//https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem

/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    
    Node currentA = headA;
    Node currentB = headB;
    
    while(currentA!=currentB){
        if(currentA==null){
            currentA = headB;
        }else{
            currentA = currentA.next;
        }
        
        if(currentB==null){
            currentB = headA;
        }else{
            currentB = currentB.next;
        }
        
    }
    return currentA.data; // also can be currentB.data as both are same
    
  
    
    
    // Complete this function
    // Do not write the main method. 


}
