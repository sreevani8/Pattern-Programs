package com.mulit;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num==0||num==1) {
			
			System.out.println(num+" is not prime number");
		}
		
		else {
			
			int middleNumber = num /2;
			for(int i=2; i<=middleNumber;i++) {
				if(num%i==0) {
					System.out.println(num + "is not prime number");
				}
			
			
		}
			
		
		
		}
		
	}

}
