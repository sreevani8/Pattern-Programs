package com.mulit;

public class RightHalfPyramid1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1 
		 * 12 
		 * 123 
		 * 1234 
		 * 12345
		 */

		
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
