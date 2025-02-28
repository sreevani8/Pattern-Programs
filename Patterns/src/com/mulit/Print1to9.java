package com.mulit;

public class Print1to9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 123
		 * 456 
		 * 789
		 */
		
		int n=3;
		
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}

}
