

//http://practice.geeksforgeeks.org/problems/k-distance-from-root/1
//http://www.geeksforgeeks.org/print-nodes-at-k-distance-from-root/

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
     // Recursive function to print right view of a binary tree.
     void printKdistance(Node root, int k){
         
         if(k==0){
             System.out.print(root.data+" ");
             return;
         }
         if(root.left!=null){
             printKdistance(root.left,k-1);
         }
         if(root.right!=null){
             printKdistance(root.right,k-1);
         }
         
          // Your code here
     }
}