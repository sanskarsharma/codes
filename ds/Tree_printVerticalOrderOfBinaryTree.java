
//http://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1
// the solution that i have proposed does not print the output in the specific order in which the problem demands. still its sexy.

//article - http://www.geeksforgeeks.org/print-binary-tree-vertical-order/

/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
/* Should print vertical order such that each vertical line
    is separated by $ */
class GfG
{
    static HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();

    void verticalOrder(Node node) {
        
        eval(node,0);
        
        int maxValueInMap=(Collections.max(h.values()));
        // This will return max value in the Hashmap
        int minValueInMap=(Collections.min(h.values()));
        // This will return min value in the Hashmap

        
        for(int i = maxValueInMap; i>=minValueInMap; i--){
            for (HashMap.Entry<Integer, Integer> entry : h.entrySet()) {  // Itrate through hashmap
                if (entry.getValue()==i) {
                    System.out.print(entry.getKey()+" ");     // Print the key with max value
                }
             }
             System.out.print("$");
             if(i==minValueInMap){
                 h.clear(); // need to clear hashmap for multiple testcases since it is static and also since you are not smart to take this approach.
             }
        }
        
        
        
            
            
    }
        
    void eval(Node node, int level){
       
        if(node.left!=null) eval(node.left,level+1);
        if(node.right!=null) eval(node.right,level-1);
        h.put(node.data,level);
    }
   
        
    // Your code here
   
}



// help from stackexchange - https://stackoverflow.com/questions/5911174/finding-key-associated-with-max-value-in-a-java-map


//3 articles of different approach are there on GfG

//http://www.geeksforgeeks.org/print-a-binary-tree-in-vertical-order-set-3-using-level-order-traversal/
//http://www.geeksforgeeks.org/print-binary-tree-vertical-order-set-2/
//http://www.geeksforgeeks.org/print-binary-tree-vertical-order/

// linkedhashmap with iterator article - https://examples.javacodegeeks.com/core-java/util/linkedhashmap/linkedhashmap-iterator-example/



// anotther approach below




/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
/* Should print vertical order such that each vertical line
    is separated by $ */
class GfG
{
    static LinkedHashMap<Integer,Integer> h = new LinkedHashMap<Integer,Integer>();

    void verticalOrder(Node node) {
        
        //eval(node,0);
        
        Queue<Pair> q = new LinkedList<Pair>();
        Pair pair = new Pair(node,0);
        q.add(pair);
        
        while(!q.isEmpty()){
            
            Pair temp = q.poll();
            
            Node noddi = temp.node;
            int level = temp.level;
            
            h.put(noddi.data,level);   // main step
            
            if(noddi.left!=null){
                q.add(new Pair(noddi.left,level+1));
                
            }
            if(noddi.right!=null){
                q.add(new Pair(noddi.right,level-1));
                
            }
            
        }
       
       
        int maxValueInMap=(Collections.max(h.values()));
        // This will return max value in the Hashmap
        int minValueInMap=(Collections.min(h.values()));
        // This will return min value in the Hashmap

        
        for(int i = maxValueInMap; i>=minValueInMap; i--){
            for (HashMap.Entry<Integer, Integer> entry : h.entrySet()) {  // Itrate through hashmap
                if (entry.getValue()==i) {
                    System.out.print(entry.getKey()+" ");     // Print the key with max value
                }
             }
             System.out.print("$");
             if(i==minValueInMap){
                 h.clear(); // need to clear hashmap for multiple testcases since it is static and also since you are not smart to take this approach.
             }
        }
        
        
        
            
            
    }
        
    // void eval(Node node, int level){
        
        
    // }
   
        
    // Your code here
    
    class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node=node;
            this.level=level;
            
        }
    }
   
}