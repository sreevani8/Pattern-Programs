package com.mulit;

public class RightHalfPyramidAtoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * A 
		 * B A 
		 * C B A 
		 * D C B A
		 */
		
		int n=4;
		
		for(int i=0;i<n;i++) {
			
			
			for(int j=i;j>=0;j--) {
				
				char ch=(char) ('A' + j);
				
				System.out.print(ch);
				
				
			}
			System.out.println();
		}
	}

}



