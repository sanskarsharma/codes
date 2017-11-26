
// https://www.interviewbit.com/problems/rotate-list/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        
        if(B==0)return A;
        if(A.next==null) return A;
        
        ListNode temp = A;
        
        int length = 0;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        
        B = B%length;
        if(B==0)return A;

        temp = A;
        
        int n = length - B;
        while(n-- > 1){
            temp = temp.next;
        }
        
        ListNode head = temp.next;
        ListNode save = temp; // saving it so that we can make it last node by save.next = null.
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = A;
        save.next = null;
        
        return head;
        
    }
}
