
//https://www.hackerrank.com/challenges/array-left-rotation/problem

import java.util.Scanner;
public class Solution{
public static void main(String args[]){

Scanner x = new Scanner(System.in);
int size = x.nextInt();
int r = x.nextInt();
int ar[] = new int[size];
for(int i = 0; i<size; i++){
ar[i]= x.nextInt();
}

// total effective rotations 
r = r%size;
for(int i =0; i<size; i++){
int k = i+ r;		// this is rigth rotation
			// for left rotation of array:      k = i +r
if(k>=size)
k=k-size;

System.out.print(ar[k]+" ");

}





}

}