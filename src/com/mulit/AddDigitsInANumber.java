package com.mulit;

import java.util.Scanner;

public class AddDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		System.out.println("Enter the number to find sum of digit : ");
		Scanner scanner = new Scanner(System.in);
		number=scanner.nextInt();
		
		int sum=0;
		while(number>0) {
			int lastDigit = number % 10;
			number = number/10;
			sum = sum + lastDigit;
			
		}
		System.out.println("sum of all digits is:" +sum);
		
		

	}

}
