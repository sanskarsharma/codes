
//http://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/
//http://www.geeksforgeeks.org/add-two-numbers-represented-by-linked-lists/
// input and output formats are different than the code. here no reversed input is needed. ^_^
/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/
class GfG
{
	Node addTwoLists(Node first, Node second)
	{
	    int dig1,dig2,sum,carry=0;
	    Node sumo= null;
	    
	    first = reeverse(first);
	    second = reeverse(second);
	    while(first!=null || second!=null){
	        if(first==null){
	            dig1 = 0;
	        }else{
	            dig1 = first.data;
	            first= first.next;
	        }
	        if(second==null){
	            dig2 = 0;
	        }else{
	            dig2 = second.data;
	            second = second.next;
	        }
	        
	        sum = dig1 + dig2 + carry;
	        carry = sum/10;
	        sum = sum%10;
	        if(sumo==null){
	            sumo = new Node(sum);
	        }else{
	            Node temp = sumo;
	            sumo = new Node(sum);
	            sumo.next= temp;
	        }
	        
	        
	    }
	    return sumo;
	    
	   // Your code here
	}
	
	Node reeverse(Node head) {
    Node prev = null;
    Node current = head;
    Node ahead = null;
    
    while(current!=null){
        
        ahead = current.next;
        current.next = prev;
        prev = current;
        current = ahead;
        
    }
    
    
    return prev;
    

}
}