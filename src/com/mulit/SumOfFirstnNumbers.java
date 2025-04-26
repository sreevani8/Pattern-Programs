package com.mulit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SumOfFirstnNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n =5;
		//Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter n value : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		
		int sum = (n*(n+1)) / 2;
		System.out.println("sum of first n numbers is:" +sum);
	}

}
