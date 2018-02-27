
//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1
// tushar roy - https://youtu.be/13m9ZCB8gjw

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
}*/
class GfG
{
	Node LCA(Node root, int n1,int n2){
	    
	    if(root==null){
	        return null;
	    }
	    
	    if(root.data == n1 || root.data == n2){
	        return root;
	    }
	    
	    Node left = LCA(root.left,n1,n2);
	    Node right = LCA(root.right,n1,n2);
	    
	    if(left instanceof Node && right instanceof Node){
	        return root;
	    }
	    
	    return (left instanceof Node)? left : right ;
	    
		// Your code here
	}
}