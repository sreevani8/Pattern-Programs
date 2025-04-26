package com.mulit;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		
		int num=sc.nextInt();//1234
		
		
		  //Logic 1 
		int rev=0; while(num!=0) {
		  
		  rev=rev*10+num%10;//0*0+1234%10=4 40+3= 43 430+2=432 4320+1=4321
		  num=num/10;//1234/10=123 123/10=12 12/10=1 1/10=0 
		  
		  }
		 
		//Using StringBuffer class
		
		/*
		StringBuffer sb1 = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb1.reverse();
		*/
		
		
		//Using StringBuilder class
		
		/*
		StringBuilder sb2 = new StringBuilder(String.valueOf(num));
		sb2.append(num);
		sb2.reverse();
		*/
		
		System.out.println("Reverse Number is:"+rev);
			
		
		
		

	}

}
