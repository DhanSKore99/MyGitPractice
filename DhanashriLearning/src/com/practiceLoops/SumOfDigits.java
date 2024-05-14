package com.practiceLoops;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumofDigits(int var) {
		/**
		 * to get the sum of digits in the given no, we need to declare
		 *  2 int type varibles first named
		 *  int lastdigit- since we need last didgit everytime to make sum &
		 *  int result - to store the sum of available digits.
		 *  then, we need to reduce the original no by 1 digit
		 *  we can achieve this by dividing no by 10.
		 *  since its int value it will destroy all decimals & we will get whole int number
		 *   
		 */
		
		int lastDigit = 0;
		int sum = 0;
		
		while(var>0) {
			lastDigit = var%10;
			sum = sum + lastDigit;
			System.out.println("Last Digit:" + lastDigit);
			System.out.println("sum:" + sum);
					
			//reduce the no by 1 digit;
			var = var/10;
			System.out.println("Updated Var is:" + var);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number:");
		int result = sumofDigits(sc.nextInt());
		System.out.println("Sum of digits of given no is:" + result);

	}

}
