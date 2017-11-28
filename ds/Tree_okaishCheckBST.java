


//variation of original problem. this solution just checks if its a okaish BST. you know, just every left node has a value smaller than //its parent and every right node has a value greater than its parent.

//https://www.hackerrank.com/challenges/is-binary-search-tree/problem

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
    boolean checkBST(Node root) {
        
        if(root==null)
            return false;
        
        
        
        Stack<Node> stk = new Stack<Node>();
        stk.push(root);
        
        while(!stk.isEmpty()){
            Node temp = stk.pop();
                        
            if(temp.right!=null){
                if(temp.right.data > temp.data){
                stk.push(temp.right);
                }else
                    return false;
            }
            if(temp.left!=null){
                if(temp.left.data < temp.data){
                stk.push(temp.left);
                }else
                    return false;
            }
            
            
        }
        
        return true;
        
        
    }
