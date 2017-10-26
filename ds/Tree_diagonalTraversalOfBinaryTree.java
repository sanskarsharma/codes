
//http://practice.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1
//http://www.geeksforgeeks.org/diagonal-traversal-of-binary-tree/

/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Node is defined as
class TreeNode
{
    int data; //node data
    TreeNode left, right; //left and right child's reference
    // Tree node constructor
    public TreeNode(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/
class GfG
{
     public void diagonalPrint(TreeNode root){
         
         Queue<TreeNode> q = new LinkedList<TreeNode>();
         q.add(root);
         
         while(!q.isEmpty()){
             TreeNode temp = q.poll();
             while(temp!=null){
                 if(temp.left!=null){
                    q.add(temp.left);
                 }
                 System.out.print(temp.data+" ");
                 temp = temp.right;
             }
             
         }
         
           //add your code here.
      }
}