
//http://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1/?ref=self

/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG
{
    boolean isPalindrome(Node head) {
        
        if(head==null)return false;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head!=null){
            list.add(head.data);
            head = head.next;
        }
        int size = list.size();
        for(int i = 0; i< size/2 ; i++){
            if(list.get(i)!=list.get(size-1-i))
                return false;
        }
        return true;
        
        
        //Your code here
    }    
}