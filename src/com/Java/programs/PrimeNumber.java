package com.Java.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num;
		boolean isPrime = true;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		num = in.nextInt();
		in.close();
		
		
		for (int i = 2; i<= num/2; i++) {
			
		
				
			if (num%i == 0) {
					isPrime = false;
					break;
			}
		}
		
		
		
		
		if(isPrime) {
			System.out.println("Number is prime.");
		}
		else {
			System.out.println("Number is not  prime.");
		}			
		
		

	}

}
