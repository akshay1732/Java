package com.Java.collections;

import java.util.*;

public class ListsInterface {

	public static void main(String[] args) {
		
		
		//************ArrayLists************************//
		
		
		 List<String> a1 = new ArrayList<String>();
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");      
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);

	      
	      
	    //************LinkedLists************************//
	      
	      List<String> l1 = new LinkedList<String>();
	      l1.add("Zara");
	      l1.add("Mahnaz");
	      l1.add("Ayan");
	      System.out.println();
	      System.out.println(" LinkedList Elements");
	      System.out.print("\t" + l1);
	      
	      
	      
	      
	}

}
