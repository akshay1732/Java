package com.Java.programs;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str1= "malayalam";
		
		StringBuilder str2 = new StringBuilder(str1);
		
		
		str2.reverse();
		System.out.println("Using StringBuilder:");
		System.out.println("Original String:"+str1);
		System.out.println("Reversed String:"+str2);
				
			if (str2.toString().equals(str1)) {
				
				
				System.out.println("\nPalindrome");
				
			}	
			else {
				
				System.out.println("\nNot Palindrome");
			}
				
			
			
			
			
		
		//using CharAt
		System.out.println("\nUsing charAT method:");
			
			
		String rev = "";
			
			for(int i=str1.length()-1; i>=0;i--) {
				
				rev= rev+str1.charAt(i);
				
			}
		
		System.out.println("Original String:"+str1);
		System.out.println("Reversed String:"+str2);
			
		if(rev.equals(str1)) {
				
			System.out.println("\nPalindrome");
				
		}
			
			
			
			
		//using Char Array
			
		System.out.println("\nUsing character Array:");
		String strrev="";
		char[] c1 = str1.toCharArray();
			
			for(int j=c1.length-1;j>=0;j--) {
				
			
			strrev=strrev+c1[j];
				
			}
			
		System.out.println("Original String:"+str1);
		System.out.println("Reversed String:"+strrev);
		if (str1.equals(strrev)) {
				
			System.out.println("\nPalindrome");
		}
		else {
			System.out.println("\nNot Palindrome");
		}
			
			
		
		
		
		// Using while loop
			
		System.out.println("\nUsing While Loop:\n");
		int a=0,b=str1.length()-1;
		boolean flag=true;
			
		while(a<b) {
				
			if(str1.charAt(a)!=str1.charAt(b)) {
				flag=false;
				break;
					
			}
				
			a++;
			b--;
				
		}
			
		if (flag) {	
			System.out.println("Palindrome");
		}
		else {
				System.out.println("\nNot Palindrome");
		}
	}

}
