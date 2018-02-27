
//https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1
// simple level order line-by-line traversal with a stack to reverse every alternate level traversals

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
      void printSpiral(Node node){
          
        Node root = node;
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        
        int count = q.size();       

        boolean toStack = true;
        Stack<Node> stk = new Stack<Node>();
        
        while(!q.isEmpty()){
            
            Node nody = q.poll();
            
            if(toStack){
                stk.push(nody);
            }else{
                System.out.print(nody.data+" ");
            }
            
            if(nody.left!=null){
                q.add(nody.left);
            }
            if(nody.right!=null){
                q.add(nody.right);
            }
                                                
            count--;                    
            if(count==0){
                if(toStack){
                    while(!stk.isEmpty()){
                        System.out.print(stk.pop().data+" ");
                    }
                }
                toStack = !toStack;
                count=q.size();
            }
            
        }
          
           // Your code here
      }
}
