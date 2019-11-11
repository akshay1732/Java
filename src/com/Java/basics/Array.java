package com.Java.basics;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
	
		 double[] myList = {2.9,1.9,3.5,3.4};

	      // Print all the array elements
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " ");
	      }
	     
	      // Summing all elements
	      double total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is " + total);
	      
	      // Finding the largest element
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is " + max);  
	      
	      Arrays.parallelSort(myList);
	      // Print all the array elements
	      for (double element: myList) {
	         System.out.println(element);
	      }
	      
	     
	   
	      
	      
	      
	      
	      
	     
	   }
		
	
	
	/*
	 * public static int binarySearch(Object[] a, Object key)
	 * 
	 * Searches the specified array of Object ( Byte, Int , double, etc.) for the
	 * specified value using the binary search algorithm. The array must be sorted
	 * prior to making this call. This returns index of the search key, if it is
	 * contained in the list; otherwise, it returns ( – (insertion point + 1)).
	 * 
	 * 2 public static boolean equals(long[] a, long[] a2)
	 * 
	 * Returns true if the two specified arrays of longs are equal to one another.
	 * Two arrays are considered equal if both arrays contain the same number of
	 * elements, and all corresponding pairs of elements in the two arrays are
	 * equal. This returns true if the two arrays are equal. Same method could be
	 * used by all other primitive data types (Byte, short, Int, etc.)
	 * 
	 * 3 public static void fill(int[] a, int val)
	 * 
	 * Assigns the specified int value to each element of the specified array of
	 * ints. The same method could be used by all other primitive data types (Byte,
	 * short, Int, etc.)
	 * 
	 * 4 public static void sort(Object[] a)
	 * 
	 * Sorts the specified array of objects into an ascending order, according to
	 * the natural ordering of its elements. The same method could be used by all
	 * other primitive data types ( Byte, short, Int, etc.)
	 * 
	 */

	

}
