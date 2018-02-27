
//http://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1
//http://www.geeksforgeeks.org/binary-tree-to-binary-search-tree-conversion/


/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */
class GfG
{
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static int i = 0;
    
    /* You are required to complete below method */
    Node binaryTreeToBST(Node root){
        
        list.clear();   // doing this to refresh static variables for multiple testcases;
        i = 0;
        
        inorder(root);  
        Collections.sort(list);
        
        inorderAlter(root);
        
        return root;
        
        
	   // Your code here
    }
    
    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    
    void inorderAlter(Node root){
        if(root == null){
            return;
        }
        inorderAlter(root.left);
        root.data = list.get(i);
        i++;
        inorderAlter(root.right);
    }
}
