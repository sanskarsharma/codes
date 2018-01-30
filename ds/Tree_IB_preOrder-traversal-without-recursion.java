
//https://www.interviewbit.com/problems/preorder-traversal/
//GfG - http://www.geeksforgeeks.org/iterative-preorder-traversal/


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
    public int[] preorderTraversal(TreeNode A) {
        
        if(A==null)return null;
        
        Stack<TreeNode> q = new Stack<TreeNode>();
        q.push(A);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(!q.isEmpty()){
            TreeNode temp = q.pop();
            list.add(temp.val);
            
            if(temp.right!=null)
            q.push(temp.right);
            if(temp.left!=null)
            q.push(temp.left);
        }
        
        int arr[] = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            arr[i] = list.get(i).intValue();
        }
        
        return arr;
        
        
        
    }
}
