package com.Java.programs;

public class RemoveSpaces {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Good B y e");
		
		
		for(int i =0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)==' ') {
				
				str.deleteCharAt(i);
				
			}		
		}
		System.out.println(str.toString());
	}

}