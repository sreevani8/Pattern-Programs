package com.mulit;

public class SumAndAvgOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5};
		int length = array.length;
		int sum =0;
		for(int i=0;i<length;i++) {
			sum = sum + array[i];
			
		}
		
		System.out.println("sum of elements of rray:" +sum);
		float avg=sum/length;
		System.out.println("average of elements of array:" +avg);

	}

}
