
// http://practice.geeksforgeeks.org/problems/check-if-subtree/1
//again the admin of this problem on GfG is a tatti insan. the problem is nice.
// neat code : http://code.geeksforgeeks.org/Zc9hr7
//http://www.geeksforgeeks.org/check-if-a-binary-tree-is-subtree-of-another-binary-tree/


class GfG{
    
public static boolean isSubtree(Tree T, Tree S) {
     
     if(S==null){
         return true;
     }
     
     if(T==null){
         return false;
     }
     
     if(isSame(T,S))
        return true;
     
     return (isSubtree(T.left, S) || isSubtree(T.right, S));
         
     }
     
     
      //add code here.
    
    static boolean isSame(Tree T, Tree S){
     if(T==null && S==null){
         return true;
     }
     if(T==null || S==null){
         return false;
     }
     
    return ((T.data==S.data) && isSame(T.left,S.left) && isSame(T.right,S.right));
    
    }
   
}