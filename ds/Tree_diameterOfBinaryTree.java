
//http://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
//http://www.geeksforgeeks.org/diameter-of-a-binary-tree/


/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
   /* Complete the function to get diameter of a binary tree */
    int diameter(Node node){
        
        if(node==null){
            return 0;
        }
        
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        
        int leftdia = diameter(node.left);
        int rightdia = diameter(node.right);
        
        return Math.max(leftheight+rightheight+1, Math.max(leftdia, rightdia));
        
        // Your code here
    }
    
    int height(Node node){
        if(node == null){
            return 0;
        }
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        
        return Math.max(leftheight,rightheight)+1;
    }
}
