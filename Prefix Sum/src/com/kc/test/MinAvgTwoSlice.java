package com.kc.test;

public class MinAvgTwoSlice {
 
	public int solution(int a[]) {
		int x=0;
		int n=a.length;
		int index1=0;
		int index2=0;
		int da[][] = new int[n][n];
		int i=0;
		int j=0;
		int min=a[0];
		for(i=0,j=0;i<n && j<n;j++) {
			
			da[i][j]=(a[i]+a[j+1])/(j-i+1);
			
			if(da[i][j]<min)
				{
					min=da[i][j];
					index1=i;
					index2=j;
				}
			if(j==n-1)
				i++;
		}
		return index1;
	}
	
	
	
	
	public static void main(String[] args) {
	 int A[]= {4,2,2,5,1,5,8};
	 MinAvgTwoSlice mat = new MinAvgTwoSlice();
	 System.out.println(mat.solution(A));
 }
}
