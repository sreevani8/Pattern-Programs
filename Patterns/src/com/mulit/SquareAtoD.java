package com.mulit;

public class SquareAtoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ABCD 
		 * ABCD 
		 * ABCD 
		 * ABCD
		 */
		
		int n=4;
		for(int i=0;i<n;i++) {
			
			char ch ='A';
			for(int j=0;j<n;j++) {
				
				System.out.print(ch);
				ch=(char) (ch+1);
				
			}
			
			System.out.println();
		}

	}

}