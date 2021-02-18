package com.Java.programs;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String str1 = "Statue of Liberty";
		String str2 = "Built to stay free";
		
		
		
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		
		System.out.println(s1+"\n"+s2);
		
		
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		
		
		Arrays.parallelSort(c1);
		Arrays.parallelSort(c2);
		
		
		if(Arrays.equals(c1, c2)) {
			
			
			System.out.println("\nAnagram");
		}
		
		
		

	}

}
