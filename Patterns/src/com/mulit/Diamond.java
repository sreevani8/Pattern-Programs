package com.mulit;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Hallow Diamond Pattern
		
		/*   *
		    * *
		   *   *
		  *     *
		   *   *
		    * *
		     *
        */
		
		int n=4;  
		
		//top part outer loop
		for(int i=0;i<n;i++) {
			
			//1.spaces
			for(int j=0;j<n-i-1;j++) {
				
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			if(i!=0) {
				//2.spaces
				for(int j=0;j<2*i-1;j++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//bottom part outer loop
		for(int i=0;i<n-1;i++) {
			
			//1.spaces
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			if(i!=n-2) {
				//2.spaces
				for(int j=0;j<2*(n-i)-5; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
