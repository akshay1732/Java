package com.Java.programs;



public class StringArraySort {

	public static void main(String[] args) {
		StringArraySort str = new StringArraySort();
		String[] s = {"Rushi","Akshay","Rohan","Prasad","Purvi","Kiran","Karan"};
		str.sort(s);
		
		for(String a:s) {
			
			System.out.println(a);
		}
	}
	
	
	
	
	
	public void sort(String[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i].compareTo(arr[j])>0) {
					
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}	
			}
		}	
	}
	
	
	
	
	
	

}
