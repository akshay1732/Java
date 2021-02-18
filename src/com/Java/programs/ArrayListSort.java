package com.Java.programs;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListSort {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,23,32,0,11,65,12,31};
		ArrayList<Integer> list = new ArrayList<Integer> (Arrays.asList(arr));


		System.out.println("\nBefore Sorting");
		for(Integer a:list) {
			
			System.out.println(a);
		}
		sort(list);
		
		System.out.println("\n\nAfter Sorting");
		
		for(Integer a:list) {
			
			System.out.println(a);
		}
	}
	
	static void sort(ArrayList<Integer> list) {
		int temp=0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				
				if(list.get(i).compareTo(list.get(j))>0) {
					
					temp= list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
						
				}
				
			}				
		}
	}
	
	
	

}
