package com.Java.programs;

import java.util.Arrays;

public class DuplicateStringChars {

	
	public static void main(String[] args) {
		
	String str = "ABCzDABzCD";	
	int count = 0;
	char[] c1 = str.toCharArray();
	Arrays.parallelSort(c1);
	
	for(int i=0;i<=c1.length-1;i++) {
		
		for(int j=i+1;j<=c1.length-1;j++) {
			
			if(c1[i]==c1[j]) {
				
				count++;
				System.out.println(c1[i]);
			}	
		}
		
	}
		
	System.out.println("No of Duplicate Characters: "+count);	
		
		
		
		
	}
	
	
}
