package com.mulit;

public class DiamondPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Diamond1(4);
		Diamond2(4);

	}

	static void Diamond1(int n) {
		/*	
			
			   *
			  ***
			 *****
			*******
			*******
			 *****
			  ***
			   *
		*/
		
		System.out.println("Double Line Diamond Pattern:");

		// top half
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// lower half
		for (int i = n; i >= 1; i--) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	static void Diamond2(int n) {
		
		/*	
			
			   *
			  ***
			 *****
			*******
			 *****
			  ***
			   *
		
		*/
		System.out.println("Single Middle line Diamond pattern:");
		// top half
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// lower half
		for (int i = n - 1; i >= 1; i--) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
