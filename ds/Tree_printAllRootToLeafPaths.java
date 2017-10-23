

//http://practice.geeksforgeeks.org/problems/root-to-leaf-paths/1
//http://www.geeksforgeeks.org/given-a-binary-tree-print-all-root-to-leaf-paths/


/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class GfG
{
	//using a static arraylist in a function problem may not be the best approach, here it works fine so no problem.
    static ArrayList<Integer> list = new ArrayList<Integer>();
    
	public void printPaths(Node root){
	    
	    list.add(root.data);
	    
	    if(root.left==null && root.right==null){
	        for(int i : list){
	            System.out.print(i + " ");
	        }
	        System.out.print("#");
	        list.remove(list.size()-1);
	        return;
	    }
	    
	    if(root.left!=null){
	        printPaths(root.left);
	    }
	    if(root.right!=null){
	        printPaths(root.right);
	    }
	    
	    list.remove(list.size()-1);     // vvimp step
	    return;
          //add code here.
       }
       
}