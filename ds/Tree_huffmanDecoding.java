
//https://www.hackerrank.com/challenges/tree-huffman-decoding/problem


/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root){
    
    StringBuffer strbuff = new StringBuffer("");
    Node current = root;
    
    for(int i = 0; i<S.length(); i++){
        if(S.charAt(i)=='0'){
            current = current.left;
        }else{
            current = current.right;
        }
        if(current.left==null && current.right==null){
            strbuff.append(current.data);
            current= root;
        }
    }
    
    System.out.print(strbuff.toString());

       
    }
