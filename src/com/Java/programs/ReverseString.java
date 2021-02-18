package com.Java.programs;



public class ReverseString {

	public static void main(String[] args) {
		
		
		String str = "Akshay";
		char[] ch = str.toCharArray();
		
		int a=0,b=ch.length-1;
		
		while(a<b) {
			
			char temp = ch[a];
			ch[a]=ch[b];
			ch[b]=temp;
	
			a++;
			b--;
		}
		
		str=String.valueOf(ch);
		System.out.println(str);

		
	
		a=0;b=str.length()-1;
		while(a<=b) {
			
			
			str=str+str.charAt(b);

			b--;
			
		}
		str=str.substring(str.length()/2);
		System.out.println(str);

		
		
		a=0;b=str.length()-1;
		while(a<=b) {

			
			
			
		}
		
		
		
	}

}

