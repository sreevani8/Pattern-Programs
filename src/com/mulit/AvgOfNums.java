package com.mulit;

import java.util.Scanner;

public class AvgOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		
		System.out.println("Enter the numbers");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		int number,sum=0;
		float avg=0;
		
		for(int i=0;i<count;i++) {
			System.out.println("enter number " +(i+1));
			number=scanner.nextInt();
			sum=sum+number;
			}
		avg=sum/count;
		
		System.out.println("sum of nums are=" +sum);
		System.out.println("count of nums are=" +count);
		System.out.println("average = " +avg);
		
		
		

	}

}
