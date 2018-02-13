
//https://practice.geeksforgeeks.org/problems/level-order-traversal-line-by-line/1/?ref=self
//https://www.geeksforgeeks.org/print-level-order-traversal-line-line/

/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
    void levelOrder(Node node) {
        
        Node root = node;
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        
        int count = q.size();       // changes for line-by-line

        while(!q.isEmpty()){
            
            Node nody = q.poll();
            System.out.print(nody.data+" ");
            if(nody.left!=null){
                q.add(nody.left);
            }
            if(nody.right!=null){
                q.add(nody.right);
            }
                                                
            count--;                    //changes for line-by-line
            if(count==0){
                System.out.print("$ ");
                count=q.size();
            }
            
        }
        
        // Your code here
    }
}