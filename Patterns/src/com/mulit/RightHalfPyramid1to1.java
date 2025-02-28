package com.mulit;

public class RightHalfPyramid1to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1 
		 * 2 1 
		 * 3 2 1
		 * 4 3 2 1
		 */

		int n=4;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j>0;j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
