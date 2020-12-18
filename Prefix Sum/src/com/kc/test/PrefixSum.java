package com.kc.test;

public class PrefixSum {
	public int solution3(int a) {
		return a+3;
	}
	public int fromChild(int a) {
		return a+10;
	}

	public static void main(String[] args) {
		int A[] = {1,3,4,5,6,7,8};
		int k = A.length;
		int nA[] = new int[k];
		nA[0]= A[0];
		for(int i=1;i<k;i++) {
			nA[i]=nA[i-1]+A[i]; 
		}
		for(int j=0;j<k;j++)
		System.out.println(nA[j]);
	}
	
}
//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(int A, int B, int K) {
   if (A % K == 0) 
         return (B / K) - (A / K) + 1; 

     // A is not divisible by M 
     return (B / K) - (A / K); 
 }

 boolean t = true;
 public void testConflicts(boolean t) {
	 if(this.t==true)
		 t=false;
	 else
		 t=true;
 }
}