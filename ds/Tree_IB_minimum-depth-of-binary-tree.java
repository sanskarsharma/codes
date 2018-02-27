
//https://www.interviewbit.com/problems/min-depth-of-binary-tree/
// level order traversal used for efficiency

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
    public int minDepth(TreeNode A) {
        
        if(A==null)return 0;
        
        Queue<Object> q = new LinkedList<Object>();
        
        q.add(A);
        q.add(new Integer(0));
        int counter = 1;
        int mindepth =0;
        
        while(!q.isEmpty()){
            
            Object node = q.poll();
            if(node instanceof TreeNode){
                TreeNode treenode = (TreeNode)node ;
                if(treenode.left== null && treenode.right==null){
                    mindepth = counter;
                    break;
                }
                if(treenode.left!=null){
                    q.add(treenode.left);
                }
                if(treenode.right!=null){
                    q.add(treenode.right);
                }
                    
                    
            }else{
                if(q.peek()==null){
                    break;
                }
                counter ++;
                q.add(new Integer(0));
            }
            
            
        }
        
        return mindepth;
        
        
    }
    
}










