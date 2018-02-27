
//https://www.hackerrank.com/challenges/balanced-brackets/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        
        Stack<Character> stk = new Stack<Character>();
                
        for(int i = 0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stk.push(c);     
            }
            else{
                switch(c){
                    case ')':
                        if(!stk.isEmpty() && stk.peek()=='(')
                            stk.pop();
                        else return "NO";
                        break;
                    case '}':
                        if(!stk.isEmpty() && stk.peek()=='{')
                            stk.pop();
                        else return "NO";
                        break;
                    case ']':
                        if(!stk.isEmpty() && stk.peek()=='[')
                            stk.pop();
                        else return "NO";
                        break;    
                        
                }
            }
        }
        
        if(stk.isEmpty()){
            return "YES";
        }else{
            return "NO";
        }
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
