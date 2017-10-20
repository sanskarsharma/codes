   
   //https://www.hackerrank.com/challenges/tree-top-view/problem

   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void topView(Node root) {
       
       if(root==null){
           return;
       }
     
       top_View(root.left,true);
       System.out.print(root.data + " ");
       top_View(root.right,false);
       
    }
    
    void top_View(Node root,boolean dir){
        if(root ==null){
            return;
        }
        
        if(dir){
            top_View(root.left,dir);
            System.out.print(root.data + " ");
        }else{
            System.out.print(root.data + " ");
            top_View(root.right,dir);
        }
        
    }














