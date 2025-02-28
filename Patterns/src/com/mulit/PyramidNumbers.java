package com.mulit;

public class PyramidNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		
		    1
		   212
		  32123
		 4321234
		543212345
		
		
	*/	
		int n=5;
		
		//1st part
		for(int i=1;i<=n;i++){
			
			//spaces
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			
			//nums 1st
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			
			
			//nums2
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
			
			
			
		}
		

	}

}
