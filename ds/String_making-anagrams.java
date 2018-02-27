

//https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
// nice problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(int i =0; i<first.length(); i++){
            char ch = first.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }
                    //    System.out.println(ch + " " +map.get(ch));

        }
         //           System.out.println("ooooooooooooooooooooo");
        int counter =0;

        for(int i =0; i<second.length(); i++){
            char ch = second.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
            }else{
                counter++;
            }
        //    System.out.println(ch + " " +map.get(ch));
        }
        for(HashMap.Entry<Character,Integer> entry : map.entrySet() ){
            if(entry.getValue().intValue() != 0){
                counter = counter + Math.abs(entry.getValue().intValue());
            }
        }
        return counter;
        
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
