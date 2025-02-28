package com.mulit;

public class RightHalfPyramidAtoJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * A
		 * BC
		 * DEF 
		 * GHIJ
		 */

		
		
		int n=4;
		
		char ch='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(ch);
				ch=(char) (ch+1);
			}
			System.out.println();
		}
	}

}
