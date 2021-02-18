package com.Java.programs;



public class FindSecondMax {

	public static void main(String[] args) {
		int[] arr = {1,33,74,22,88,6,65,56,90};
		
		/*
		 * Arrays.parallelSort(arr);
		 * 
		 * 
		 * 
		 * int secondmaxindex = arr.length-2;
		 * 
		 * 
		 * System.out.println("Second Max:"+arr[secondmaxindex]);
		 */
		
		int max=0,secondmax=0;
		for (int a:arr) {
		
			if(a>max) {
				secondmax=max;
				max=a;

			}
			
			
		}
		System.out.println(secondmax);
		
	
	}

}
