package com.Java.programs;

public class ReverseStringArray {

	
	public static void main(String[] args) {
		
		System.out.println("\nWithout Using Third Variable:");	
		String[] arr = {"ONE", "TWO","THREE","FOUR"};
		int a=0,b=arr.length-1;
		
		while(a<b) {
		int len = arr[a].length();
		
		arr[a]=arr[a]+arr[b];
		arr[b]=arr[a].substring(0, len);
		arr[a]=arr[a].substring(arr[b].length());
		
		a++;
		b--;
		
		}
		
		for(String i:arr) {
			System.out.println(i);
		}
		
		
//**************************************************************************************//
		
		
		
		System.out.println("\nUsing Third String Variable:");	
		String[] arr1 = {"ONE", "TWO","THREE","FOUR"};
		a=0;b=arr1.length-1;
		
		while(a<b) {
			String str = arr1[b];
			arr1[b]=arr1[a];
			arr1[a]=str;
			
			a++;
			b--;
			
		}
			
		for(String i:arr1) {
			System.out.println(i);
		}
			
		
	}

}
