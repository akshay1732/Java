package com.Java.programs;

public class NumberPalindrome {

	public static void main(String[] args) {
		int number = 1221;
		int d=0,rev = 0;
		
		
		while(number>0) {
			
			
			d= number%10;
			rev = rev*10+d;
			number = number/10;
			
		}
		
		System.out.println(rev);
		

	}

}
