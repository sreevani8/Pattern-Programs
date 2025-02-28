package com.mulit;

public class RightHalfPyramid1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1 
		 * 23 
		 * 456 
		 * 78910
		 */
		
		int n=4;
		
		int num=1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(num);
				num++;
			}
			
			System.out.println();
		}

	}

}
