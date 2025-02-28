package com.mulit;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //  1
		//  121
		// 12321
		//1234321

		
		
		int n=4;
		
		//rows
		for(int i=0;i<n;i++) {
			
			//spaces
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			
			//nums1
			for(int j=1;j<=i+1;j++) {
				System.out.print(j);
			}
			
			//nums2
			
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			
				
		System.out.println();	
			
			
		}
	}

}
