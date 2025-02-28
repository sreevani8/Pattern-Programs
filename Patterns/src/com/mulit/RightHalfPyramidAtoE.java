package com.mulit;

public class RightHalfPyramidAtoE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    /*A
		  B B
		  C C C
		  D D D D */
		
		int n=4;
		
		for(int i=0;i<n;i++) {
			
			char ch=(char) ('A' + i);
			
			
			for(int j=0;j<i+1 ;j++) {
				System.out.print(ch  +" ");
				
				
			}
		
			System.out.println();
		}
		
		
	}

}
