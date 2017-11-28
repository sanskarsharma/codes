
// Jai Shree Ganesh Dynamic Programming :)
//http://practice.geeksforgeeks.org/problems/nth-fibonacci-number/0
// article - http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/   // O(1) space complexity method is nice


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    
	public static void main (String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    int t = x.nextInt();
	    
	    while(t-- != 0){
	        int num = x.nextInt();
	        System.out.println(fibo(num));
	    }
	    
		//code
	}
	
	static int fibo(int num){
	    if(num==0)return 0;
	    if(num==1)return 1;
	    if(map.containsKey(num)){
	        return map.get(num);
	    }
	    map.put(num,((fibo(num-1)%1000000007)+(fibo(num-2)%1000000007))%1000000007);
	    return map.get(num);
	}
}