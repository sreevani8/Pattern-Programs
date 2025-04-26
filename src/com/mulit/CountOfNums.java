package com.mulit;

import java.util.Scanner;

public class CountOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		
		System.out.println("Enter count of numbers");
		
		Scanner scanner = new Scanner(System.in);
		
		
		count =scanner.nextInt();
		
		int number, sum=0;
		for(int i=0;i<count;i++) {
			
			System.out.println("enter number" +(i+1));
			number=scanner.nextInt();
			sum = sum + number;
			
			
		}
		System.out.println("sum of all these numbers:" +sum);
		
		
		

	}

}
