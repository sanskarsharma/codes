
//https://www.hackerrank.com/challenges/tree-level-order-traversal/problem


   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       
       Queue q = new LinkedList();
       System.out.print(root.data + " ");
       q.add(root);
        
       while(!q.isEmpty()){
           Node a = (Node)q.poll();
           
           if(a.left!=null){
           System.out.print(a.left.data + " ");
           q.add(a.left);
           }
          
           if(a.right!=null){
           System.out.print(a.right.data+ " ");
           q.add(a.right);  
           }
           
       }
       
    }



/* a more elegant solution

Queue queue=new LinkedList(); 
queue.add(root); 
while(!queue.isEmpty()) 
{ 
Node tempNode=queue.poll(); 
System.out.print(tempNode.data+" "); 
if(tempNode.left!=null) 
queue.add(tempNode.left); 
if(tempNode.right!=null) 
queue.add(tempNode.right); 
}


*/