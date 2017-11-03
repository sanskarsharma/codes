

// gives TLE , admin is chutia - http://practice.geeksforgeeks.org/problems/maximum-width-of-tree/1
//http://www.geeksforgeeks.org/maximum-width-of-a-binary-tree/
// i have used level order traversal with a queue to solve, many other approches posssible but this looks optimum.


/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* A Binary Tree node
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
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root){
        
        if(root==null){
            return 0;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(new Node(998877));	// any other value to be used as flag.
        
        int max=0,count=0;
        
        while(!q.isEmpty()){
            
            Node temp = q.remove();
            
            if(temp.data==998877){
                if(count>max){
                    max = count;
                    count = 0;
                }
                q.add(new Node(998877));
            }else{
                count++;
            }
            
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
    
        }
        
        return max;
        
        // Your code here
    }		
}
