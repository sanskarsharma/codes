
//https://www.interviewbit.com/problems/identical-binary-trees/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public int isSameTree(TreeNode a, TreeNode b) {
	    
	    boolean ans = recur(a,b);
	    if(ans)return 1;
	    return 0;
	    
	}
	boolean recur(TreeNode a, TreeNode b){
	    if(a==null && b==null){
	        return true;
	    }
	    if(a==null || b==null){
	        return false;
	    }
	    
	    if(a.val != b.val)
	        return false;
	    
	   return  recur(a.left,b.left) &&  recur(a.right,b.right);
	    
	}
}
