

//https://www.interviewbit.com/problems/least-common-ancestor/
//http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/
// controversial question. IB is bullshit


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
    
    static ArrayList<Integer> list = new ArrayList<Integer>();

	public int lca(TreeNode a, int val1, int val2) {
	    
	    if(a.val==val1 || a.val==val2) return a.val ;
	    
	    list.add(0);
	    list.add(0);
	    list.add(0);
	    
	    TreeNode ans = findlca(a, val1, val2);
	    
	    if(ans==null){
	        list.clear();
	        return -1 ;
	    }
	    
	    if(list.get(0).intValue() == 1 && list.get(1).intValue()==1){
	        list.clear();
	        return ans.val ;
	    }
	    else{
	        int value = (ans.val==val1? val2 : val1);
	        preordertrav(ans, value);
	        if(list.get(2).intValue()==2){
	            list.clear();
	            return ans.val ;
	        }
	        else{
	            list.clear();
	            return -1;

	        }
	    }
	    
	}
	
	static void preordertrav(TreeNode node, int value){
	    
	    if(node==null) return;
	    
	    if(node.val==value) list.set(2,2);
	    
	    preordertrav(node.left, value);
	    preordertrav(node.right, value);
	    
	    
	}
	
	
	
	TreeNode findlca(TreeNode node, int v1, int v2){
	    
	    if(node==null)
	        return null;
	        
	    if(node.val==v1){
	        list.set(0,1);
	        return node;
	    }
	    if(node.val==v2){
	        list.set(1,1);
	        return node;
	    }
	        
	    TreeNode goleft = findlca(node.left, v1 , v2);
	    TreeNode goright = findlca(node.right, v1, v2);
	    
	    if(goleft!=null && goright!=null)
	        return node;
	    else
	        return (goleft==null? goright : goleft);
	    
	    
	}
}
