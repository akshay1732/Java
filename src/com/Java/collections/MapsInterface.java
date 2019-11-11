package com.Java.collections;

import java.util.*;


public class MapsInterface {

	public static void main(String[] args) {
		
	//*****************HashMaps***************************//	
		
		
		Map<Integer, String> m1 = new HashMap<Integer, String>(); 
		
		  m1.put(10,"Zara" ); 
		  m1.put(9,"Mahnaz" ); 
		  m1.put(32,"Ayan" );
		  m1.put(15,"Daisy" );
		  m1.put(16,"Daisy" );
		  
		  //Can store duplicate values but not duplicate keys 
		  m1.put(15,"Daisy" );
		 
		  
		  //HashMaps can have only one null key and multiple null values	
		  m1.put(2,null );
		  m1.put(3,null );
		  m1.put(null,"Akshay" );
		  m1.put(null,"Hrishi" );
		  
		  
		  //HashMaps don't maintain insertion order
		  
	      System.out.println();
	      System.out.println("HashMap Elements:");
	      System.out.print(m1);
	      
	      
	 //******************LinkedHashMaps*******************//
	      
	      //LinkedHashMaps are hashmaps that maintain insertion order
	      
	      Map<Integer, String> m3 = new LinkedHashMap<Integer, String>(); 
	      
	      m3.put(10,"Zara" ); 
		  m3.put(9,"Mahnaz" ); 
		  m3.put(32,"Ayan" );
		  m3.put(15,"Daisy" );
		  m3.put(16,"Daisy" );
		  m3.put(15,"Daisy" ); //Doesn't store both duplicate key+values
		  m3.put(2,null );
		  m3.put(3,null );
		  m3.put(null,"Akshay" );
		  m3.put(null,"Hrishi" );
	      
		  //LinkedHashMaps maintain insertion order
		  
	      System.out.println();
	      System.out.println("\nLinkedHashMap Elements:");
	      System.out.print(m3);
	      
	      
	      
	      
	//*****************TreeMaps***************************//     
	      
		
		  Map<Integer, String> m2=new TreeMap<Integer, String>();
		  
		  //TreeMaps cannot have a null key but can have null values  
		  m2.put(10,"Zara" ); 
		  m2.put(9,"Mahnaz" ); 
		  m2.put(32,"Ayan" );
		  m2.put(15,"Daisy" );
		  m2.put(16,"Daisy" );
		  m2.put(2,null );
		  m2.put(3,null );
		  
		  
		  //m1.put(null,"Akshay" ); gives null pointer exception
		  
		  
		  System.out.println("\n\nSorted TreeMap Elements:"); System.out.print(m2);
		 
		  
	      
	
	}

}
