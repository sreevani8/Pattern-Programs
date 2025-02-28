package com.mulit;

public class RightHalfPyramid1to4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 1 
		 * 2 2 
		 * 3 3 3 
		 * 4 4 4 4
		 */

		
		int n=4;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				
				System.out.print(i+1 +" ");
			}
			System.out.println();
		}

	}

}
