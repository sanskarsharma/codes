
//https://www.interviewbit.com/problems/populate-next-right-pointers-tree/

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        
        TreeLinkNode node = root;
        
        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
        q.add(node);
        
        int count = q.size();
        
        while(!q.isEmpty()){
            
            TreeLinkNode nody = q.poll();
            
            if(count>1){
                
                nody.next = q.peek();
                
            }
            
            if(nody.left!=null){
                q.add(nody.left);
            }
            if(nody.right!=null){
                q.add(nody.right);
            }
            
            count--;
            if(count==0){
                count = q.size();
            }
            
            
        }
        
        
    }
}
