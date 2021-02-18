package com.Java.programs;

public class CountSpaces {

	public static void main(String[] args) {
		String str1 = "Statue of Liberty";
		
		int num = str1.length()-str1.replaceAll(" ", "").length();
		
		for(int i=0;i<num;i++) {
			
			str1=" "+str1;
			
		}

		System.out.println(str1);
		char[] ch = {'T','e','s','t'};
		String str2 = new String(ch);
		
		System.out.println(str2);
	}

}
