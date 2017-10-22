 
//https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
// recursive solution in discussion looks short plus neat 


 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
        
    Node tobe = new Node();
    tobe.data = value;
    tobe.left= tobe.right = null;
    
    if(root==null)
        return tobe;
    
    Node current = root;
    Node target = root;
    
    while(current!=null){
        target = current;
        if(value <= current.data){
            current = current.left;
        }else{
            current = current.right;
        }
    }
    
    if(value<= target.data){
        target.left = tobe;
    }else{
        target.right= tobe;
    }
    
    return root;

       
    }


