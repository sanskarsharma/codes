

//http://practice.geeksforgeeks.org/problems/size-of-binary-tree/1

/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete The Function Below*/
class GfG{
	public static int size(TreeNode root){
	    
	    if(root==null){
	        return 0;
	    }
	    return (size(root.left) + 1 + size(root.right));
	    
	    
//add Code here.
}
}