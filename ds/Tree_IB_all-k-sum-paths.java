
//https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/

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
    static ArrayList<ArrayList<Integer>> parentlist = new ArrayList<ArrayList<Integer>>();
    
    public int[][] pathSum(TreeNode A, int B) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        haspath_sum(A, B, 0, list);
        
        int [] parentarray[] = new int [parentlist.size()][];
        // this line is very doubtful
        
        for(int i =0; i<parentarray.length; i++){
            int array[] = new int[parentlist.get(i).size()];
            for(int j = 0; j< array.length; j++){
                array[j] = parentlist.get(i).get(j).intValue();
            }
            parentarray[i]= array;
        }
        parentlist.clear();
        return parentarray;
        
        
    }
    
    void haspath_sum(TreeNode node, int sum, int sum_so_far, ArrayList<Integer> list){
        
        if(node==null)return ;
        
        sum_so_far =+ node.val;
        
        list.add(node.val);
        
        if(sum_so_far == sum){
            parentlist.add(list);
        }
        
        
        if(node.left!=null){
            haspath_sum(node.left, sum, sum_so_far, list );
        }
        if(node.right!=null){
            haspath_sum(node.right, sum, sum_so_far, list);
        }
        
        list.remove(list.size()-1);
        return;
       
        
    }
}
