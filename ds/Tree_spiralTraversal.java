
//http://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1
//http://www.geeksforgeeks.org/level-order-traversal-in-spiral-form/


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
}
*/
class GfG
{
      void printSpiral(Node node) {
          
          Queue<Object> q = new LinkedList<Object>();
          q.add(node);
          q.add(new String("marker"));
          
          Stack<Node> stk = new Stack<Node>();
          
          
          boolean toStack = true;
          
          while(!q.isEmpty()){
              
              
              Object temp = q.poll();
              if(temp.equals("marker")){
                  if(q.peek()!=null){
                        q.add(new String("marker"));
                  }
                  toStack = !toStack;
                  while(!stk.isEmpty()){
                      Node n = stk.pop();
                      System.out.print(n.data + " ");
                  }
                  continue;
              }
              
              Node nod = (Node) temp;
              if(toStack){
                  stk.push(nod);
              }else{
                  System.out.print(nod.data + " ");
              }
              
              if(nod.left!=null){
                  q.add(nod.left);
              }
              if(nod.right!=null){
                  q.add(nod.right);
              }
              
              
              
              
          }
          
           // Your code here
      }
}
