

//https://www.hackerrank.com/challenges/is-binary-search-tree/problem
// solved it with this approach : https://www.hackerrank.com/challenges/is-binary-search-tree/forum/comments/155376
// EDIT : this algo by tushar roy is nice, without overhead - https://youtu.be/MILxfAbIhrE


/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/

    static ArrayList<Integer> list = new ArrayList<Integer>();
    boolean checkBST(Node root) {
        
        inOrder(root);
        
        for(int i = 1; i< list.size(); i++){
            if(list.get(i)<=list.get(i-1))
                return false;
        }
        return true;
         
    }
    
    void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }
    
