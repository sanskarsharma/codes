
//https://www.interviewbit.com/problems/path-sum/

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
    public int hasPathSum(TreeNode A, int B) {
        
        if(A.left==null && A.right==null && A.val==B){
            return 1;
        }
        
        int left=0,right=0;
        
        if(A.left!=null){
             left = hasPathSum(A.left, B-A.val);
        }
        if(A.right!=null){
             right = hasPathSum(A.right, B-A.val);
        }
        
        if(left==1 || right==1)return 1;
        else return 0;
        
        
        
        
    }
}
