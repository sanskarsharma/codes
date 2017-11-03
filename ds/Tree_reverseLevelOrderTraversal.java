
//http://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1
//http://www.geeksforgeeks.org/reverse-level-order-traversal/

/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG
{
	void reversePrint(Node node) {
	    
	    Queue<Node> q = new LinkedList<Node>();
	    q.add(node);
	    Stack<Node> stk = new Stack<Node>();
	    
	    ArrayList<Node> list = new ArrayList<Node>();
	    
	    while(!q.isEmpty()){
	        Node temp = q.poll();
	        stk.push(temp);
	        
	        if(temp.right!=null){       // right node first
	            q.add(temp.right);
	        }
	        if(temp.left!=null){
	            q.add(temp.left);
	        }
	        
	    }
	    
	    while(!stk.isEmpty()){
	        System.out.print(stk.pop().data+ " ");
	    }
    
     // your code here
	    
	}
}      
       
