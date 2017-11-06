

//http://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list/0
//http://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list/
// coded this from scratch. i rock


import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class GFG {
	public static void main (String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    int t = x.nextInt();
	    
	    while(t-- != 0){
	        int n = x.nextInt();
	        
	        Node head = new Node(x.nextInt());
	        Node parent = head;
	        
	        
	        while(n-- > 1){
	            Node node = new Node(x.nextInt());
	            parent.next = node;
	            parent = node;
	        
	        }
	        
	        evenOdd(head);
	        
	    }
	    
		//code
	}
	
	static void evenOdd(Node head){
	        
	        Queue<Node> q = new LinkedList<Node>();
	        
	        Node prev = null;
	        Node current = head;
	        
	        while(current!= null){
	            if(current.data%2 != 0){
	                if(prev==null){
	                    head = current.next;
	                }else{
    	                prev.next = current.next;
	                }
	                q.add(current);
	                
	            }else{
	                prev = current;
	                
	            }
	            current = current.next;
	            
	        }
	        
	        if(prev==null){
	            prev = q.poll();
	            head = prev;
	        }
	        
	        while(!q.isEmpty()){
	            Node odd = q.poll();
	            odd.next = null;
	            prev.next = odd;
	            prev = odd;
	            
	        }
	        
	        while(head!=null){
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println();
	        
	        
	    }
	    
	    
}