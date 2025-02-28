package com.mulit;

public class SquareAtoI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ABC
		//DEF
		//GHI

		
		int n=3;
		
		char ch='A';
		for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(ch);
			ch=(char) (ch+1);
		}
		System.out.println();	
		}

	}

}
