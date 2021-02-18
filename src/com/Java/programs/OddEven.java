package com.Java.programs;

import java.io.*;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) throws IOException {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num = scn.nextInt();
		scn.close();
		
		
		
		boolean flag  = true;
		for (int i = 0; i<num;i++) {
				
			flag = !flag;	
		}
		
		if(flag) {
			
			System.out.println("\nEven Number");	
		}
		else {
			
			System.out.println("\nNot Even Number");
		}

	}

}
