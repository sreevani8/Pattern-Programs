package com.mulit;

public class SwapTwoNumbers {
	
	
	//Swap 3 numbers without using 3rd variable
	static void Swapping(int a,int b, int c) {
		
		System.out.println("Before Swapping Values are.."+a +"" +b +"" +c);
		
		a=a+b+c; //10+20+30=60
		b=a-(b+c);//60-(20+30)=10   Given b=20  Now b=10
		c=a-(b+c);//60-(10+30)=20   Given c=30  Now c=20
		a=a-(b+c);//60-(10+20)=30	Given a=10  Now a=30
		
		System.out.println("After Swapping values are..a=" +a + "b=" + b + "c=" +c);
	}

	// Using Third Variable
	static void Swap1(int a, int b) {

		System.out.println("Before Swapping Values are.." + a + " " + b);

		int t = a; // 10

		a = b; // 20

		b = t; // 10

		System.out.println("After Swapping Values are.." + a + " " + b);
	}

	// using + & - without Third Variable
	static void Swap2(int a, int b) {

		System.out.println("Before Swapping Values are.." + a + " " + b);

		a = a + b; // 6+4=10

		b = a - b; // 10-4=6

		a = a - b; // 10-6=4

		System.out.println("After Swapping Values are.." + a + " " + b);
	}

	// using * & /
	static void Swap3(int a, int b) {

		System.out.println("Before Swapping.." + a + " " + b);

		a = a * b; // 10*2=20
		b = a / b; // 20/2=10
		a = a / b; // 20/10=2

		System.out.println("After Swapping.." + a + " " + b);

	}

	public static void main(String[] args) {

		// Swap1(10,20);
		// Swap2(6, 4);
		  // Swap3(10, 2); 
		   Swapping(10,20,30);
	}

}
