

//tushar roy - https://www.youtube.com/watch?v=Jg4E4KZstFE&index=7&list=PLrmLmBdmIlpv_jNDXtJGYTPNQ2L1gdHxu
//found on GfG - http://practice.geeksforgeeks.org/problems/root-to-leaf-path-sum/1
// article on GfG - http://www.geeksforgeeks.org/root-to-leaf-path-sum-equal-to-a-given-number/



/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*

// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int sum){
        
        boolean ans = false; // this variable is imp for not returning false always when we encounter that path sum is not equal to sum
        //we use OR on this vriable to find if any path sum is equal to our sum
        
        if(root.left==null && root.right==null){
            if(root.data==sum){
                return true;
            }else{
                return false;
            }
        }
        
        if(root.left!=null){
            ans = ans || hasPathSum(root.left, sum-root.data);
        }
        if(root.right!=null){
            ans = ans || hasPathSum(root.right, sum-root.data);
        }
        return ans;
        
        
        // brialliat use of OR in the if conditions above.
        // see if there is a path to the left, ans becomes true
        //even if the next if condition i.e path to the right returns false,
        // ans will still be true as : true||false = true
        //In another case, if path to left gives false and path to right gives true
        // our ans will be true due to the statement in second if block. sweet
        
        // Your code here
    }
}