package com.Java.datastructures;
import java.util.*;


public class HashMaps {

	
	

	   public static void main(String[] args) {
	      Map<String, String>  m1 = new HashMap<String, String>(); 
	      
	      
	      m1.put("8","Zara" );
	      m1.put("31","Mahnaz");
	      m1.put("12","Ayan");
	      m1.put("14","Daisy");
	      
	      System.out.println(m1.get("31"));
	      
	      System.out.println(m1.keySet());
	      System.out.println(m1.entrySet());
	      
	      
	      int size=m1.size();
	      System.out.println(size);

	      System.out.println();
	      System.out.println("Map Elements:");
	      System.out.print("\n" + m1);
	   }
	

}
