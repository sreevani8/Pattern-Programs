package com.mulit;

public class Rhombus {

	public static void main(String args[]) {
/*
		
		    *****
		   *****
		  *****
		 *****
		*****

*/
		int n=5;
		
		//outer loop
		for(int i=1;i<=n;i++) {
			
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print (" ");
			}
			
			//stars
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
