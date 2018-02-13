
//https://practice.geeksforgeeks.org/problems/print-bst-elements-in-given-range/1/?ref=self

/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* The structure of a BST node is as follows:
class Node
{
    int key;
    Node left, right;
    Node(int item)
    {
        key = item;
        left = right = null;
    }
} */
class GfG
{   
    void Print(Node node, int k1, int k2){
        
        Node root = node;
        
        trav(root,k1,k2);
        
        // Your code here
    }    
    
    void trav(Node root,int lo, int hi){
        if(root==null)
            return;
        
        trav(root.left,lo,hi);
        if(root.key >= lo && root.key <=hi)
            System.out.print(root.key+" ");
        trav(root.right,lo,hi);
        
    }
}