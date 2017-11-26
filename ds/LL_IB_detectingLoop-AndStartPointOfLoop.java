
//https://www.interviewbit.com/problems/list-cycle/
// https://stackoverflow.com/a/6110767 - precious help. Floyd's algo for cycle detection has two parts. 1) detect loop 2) detect startting node of loop.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    
	    ListNode p = a;
	    ListNode q = a;

	    boolean flag = true;
	    
	    while(q!=null && q.next!=null){
	        p = p.next;
	        q = q.next.next;
	        if(p==q){
	            flag = false;
	            break;
	        }
	    }
	    
	    if(flag)
	    return null;
	    
	    p = a;      // setting slow pointer to head of LL
	    
	    while(true){
	        if(p==q){
	            return p;   // imp that this if condition be before the below statements
	        }               // to cover the case when the loop is between last and 1st node of LL
	        p = p.next;
	        q = q.next;
	        
	    }
	    
	    
	    
	    
	    
	}
}
