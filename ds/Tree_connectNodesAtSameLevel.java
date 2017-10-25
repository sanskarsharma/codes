

//http://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1
//http://www.geeksforgeeks.org/connect-nodes-at-same-level/
// mine is a little botched up algo


/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// A Binary Tree node
/* class Node
{
    int data;
    Node left, right, nextRight;
    Node(int item)
    {
        data = item;
        left = right = nextRight = null;
		
    }
} */
class GfG
{
    void connect(Node root){
        
        if(root==null){
            return;
        }
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(new Node(1010101));
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            
            if(q.peek()==null){
                return;
            }
            
            if(!(q.peek().data==1010101)){
                temp.nextRight= q.peek();
            }else{
                    q.poll();
                    q.add(new Node(1010101));
                    temp.nextRight = null;
            }
            
            
        }
        
        
        // Your code here	
    }
}