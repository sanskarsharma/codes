
//https://www.interviewbit.com/problems/inorder-traversal/
// GfG article - http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/


/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int[] inorderTraversal(TreeNode A) {
        
        if(A==null)return null;
        
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode node = A;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        
        while(node!=null){
            stk.push(node);
            node = node.left;
        }
        
        while(!stk.isEmpty()){
            
            node = stk.pop();
            
            list.add(node.val);
            
            if(node.right!=null){
                node = node.right;
                while(node!=null){
                    stk.push(node);
                    node = node.left;
                }
                
            }
            
        }
        
        int arr[] = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        
        return arr;
        
        
    }
}
