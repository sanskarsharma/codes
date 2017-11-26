

// this is the most complex - unneccesarily complex - algorithm i have ever writter. shame 
//https://www.interviewbit.com/problems/partition-list/



/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode A, int B) {
        
        if(A.next==null)return A;
        
        ListNode temp = A;
        while(temp.next!=null){
            temp = temp.next;
        }
        ListNode last = temp;
        
        ListNode prev = null;
        ListNode link = new ListNode(101010);
        ListNode ref = link; 
        
        temp = A;
        while(temp.next!=null){
            if(B <= temp.val){
                if(prev!=null){
                
                prev.next = temp.next;
                
                link.next = temp;
                link = link.next;
                link.next = null;
                
                temp = prev.next;
                
                }else{
                    A = A.next;
                    
                    link.next = temp;
                    link = link.next;
                    link.next = null;
                    
                    temp = A;
                    
                }
                
            }
            else{
                prev = temp;
                temp = temp.next;
            }
            
        }
        
        if(B<=temp.val){
            //prev.next = temp.next;
                
                link.next = temp;
                link = link.next;
                link.next = null;
                
                temp = prev;
                if(temp!=null)temp.next=null;
        }
        
        if(temp!=null)
        temp.next = ref.next;
        
        if(A.next==null){
            return ref.next;
        }
        return A;
    }
}
