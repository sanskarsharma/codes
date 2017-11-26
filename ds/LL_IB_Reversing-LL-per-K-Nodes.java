

//https://www.interviewbit.com/problems/k-reverse-linked-list/



/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        
        while(A != null){
            
            int k = B;
            ListNode prev = null;
            ListNode current = A;
            ListNode ahead = null;
            
            while(k != 0 && current!=null){
                ahead = current.next;
                current.next = prev;
                
                prev = current;
                current = ahead;
                
                k--;
            }
            
            list.add(prev);     // instead of adding nodes in a list, we can traverse each sub-reversed list and add the next subreverse and so on
                                // we would need a flag boolean to save the head of 1st sub reverse as we need to return it as function output

            A = current; // "current" is right now the next node after sub-reversing K nodes of list
            
        }
        



        for(int i =0; i<list.size()-1; i++){        
            ListNode node = list.get(i);
            while(node.next!=null){
                node = node.next;
            }
            node.next= list.get(i+1);
            
        }
        
        return list.get(0);
        
        
    }
}
