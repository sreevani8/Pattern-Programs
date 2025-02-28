package com.mulit;

public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*
		*        *
		**      **
		***    ***
		****  ****
		**********
		**********
		****  ****
		***    ***
		**      **
		*        *
*/
		
		int n = 5;

		// top half part
		for (int i = 1; i <= n; i++) {

			// first half
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// spaces
			int spaces = 2*(n-i);
			for (int j = 1; j <= spaces; j++) {

				System.out.print(" ");
			}

			// second half
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();

		}

		// bottom outer loop

		for (int i = n; i >= 1; i--) {

			// first part
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			// spaces
			int spaces = 2*(n-i);
			for (int j = 1; j <= spaces; j++) {

				System.out.print(" ");
			}

			// second half
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();

		}

	}

}
