package com.mulit;

public class InvertedLeftHalfPyramidA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		   AAAA
		    BBB 
		     CC 
		      D
		 */
		
		
		int n=4;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			char ch = (char) ('A' + i);
			for(int j=0;j<n-i;j++) {
				
				System.out.print(ch);
			
				
			}
			
			System.out.println();
		}

	}

}
