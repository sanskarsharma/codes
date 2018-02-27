
//https://www.hackerrank.com/challenges/simple-text-editor/problem


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner x = new Scanner(System.in);
        int q = x.nextInt();
        
        StringBuffer strbuff = new StringBuffer("");
        Stack<String> stk = new Stack<String>();
        
        while(q-- !=0 ){
            int p = x.nextInt();
            switch(p){
                case 1:
                    stk.push(strbuff.toString());
                    String w = x.next();
                    strbuff.append(w);
                    break;
                case 2:
                    stk.push(strbuff.toString());
                    int k = x.nextInt();
                    strbuff.delete(strbuff.length()-k,strbuff.length());
                    break;
                case 3:
                    System.out.println(strbuff.charAt(x.nextInt()-1));
                    break;
                case 4:
                    strbuff = new StringBuffer(stk.pop());
                    break;
            }
           // System.out.print(" "+strbuff.toString()+" ");
        }
    
    }
}