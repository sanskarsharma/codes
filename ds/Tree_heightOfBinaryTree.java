	
//https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem

    /*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
        
        if(root==null){
            return -1;
        }
        
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        
        return(1 + Math.max(leftheight, rightheight));
        
        
        
        
      	// Write your code here.
    }
