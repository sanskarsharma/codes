

//https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
// nice problem

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2){
    
    Node temp = root;
    
    while(true){
        if(v1<temp.data && v2<temp.data)
            temp = temp.left;
        else if(v1>temp.data && v2>temp.data)
            temp = temp.right;
        else
            return temp;
    }

      
    }




//current solution is borrowed from the below comment in discussion
//https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/forum/comments/340413

// recursive solution with same logic from the comments
//https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/forum/comments/73223





// the approach below was my first attempt. it gave TLE. Its time complexity is O(n*n)
// still no clue if it is correct ^_^


 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2){
    
    while(root!=null){
        int ans = finder(root,v1,v2);
        if(ans == 0){
            root = root.left;
        }else if(ans == 1){
            root = root.right;
        }else{
            return root;
        }
        
        
    }
    
    return root;
       
    }

    static int finder(Node root,int v1, int v2){
        Stack stk = new Stack();
        stk.push(root);
        boolean v1found= false,v2found= false;
        while(!stk.isEmpty()){
            Node temp = (Node)stk.pop();
            if(temp.data == v1){
                v1found = true;
            }
            else if(temp.data == v2){
                v2found = true;
            }
        
            if(temp.right!=null)
                stk.push(temp.right);
            if(temp.left!=null)
                stk.push(temp.left);
                      
        }
        if(v1found && v2found)
            return 0;
        else if(v1found || v2found)
            return 2;
        else
            return 1;
              
        
    }




