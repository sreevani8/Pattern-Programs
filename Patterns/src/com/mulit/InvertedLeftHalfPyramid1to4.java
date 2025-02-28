package com.mulit;

public class InvertedLeftHalfPyramid1to4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1111 
		 *  222 
		 *   33 
		 *    4
		 */

		int n = 4; // Number of rows

		for (int i = 0; i < n; i++) {
			
			// Print leading spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// Print numbers
			for (int j = 0; j < n - i; j++) {
				System.out.print(i + 1);
			}

			// Move to the next line
			System.out.println();
		}
	}
}