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

	      System.out.println("\n");
	      for (String s: a1) {
	    	  
	    	  System.out.println(s);
	    	  
	      }
	      
	      System.out.println("\n");
	      Iterator<String> itr = a1.iterator();
	      while(itr.hasNext()) {
	    	  System.out.println(itr.next());
	    	  
	      }
	      
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
