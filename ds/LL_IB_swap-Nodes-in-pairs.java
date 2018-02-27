
//https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if(A.next==null){
            return A;
        }
        
        ListNode temp = A;
        ListNode second = null;
        ListNode third = null;
        ListNode prev = null;
        ListNode returnNode = A.next;
        
        while(temp!=null){
            if(temp.next!=null){
                second = temp.next;
                third = temp.next.next;
                second.next = temp;
                temp.next = third;
                if(prev!=null){
                    prev.next = second;
                }
                prev = temp;
            }
            
            temp = temp.next;
        }
        return returnNode;
        
    }
}
