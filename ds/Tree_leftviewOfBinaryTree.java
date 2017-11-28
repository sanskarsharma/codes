
//http://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
//http://www.geeksforgeeks.org/print-left-view-binary-tree/

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
    void leftView(Node root){
        
        System.out.print(root.data + " ");
        
        if(root.left!=null){
            leftView(root.left);
        }else if(root.right!=null){
            leftView(root.right);
        }
        
      // Your code here
    }
}