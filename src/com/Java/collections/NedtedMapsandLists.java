package com.Java.collections;


import java.util.*; 


public class NedtedMapsandLists {

	public static void main(String[] args) {
		
		//Passing Arrays to Lists 
	
		String[] str = {"Akshay","Akash","Abhi","rushi"};
		String[] str1 = {"Akshay1","Akash1","Abhi1","rushi1"};
		String[] str2 = {"Akshay3","Akash3","Abhi3","rushi3"};
		
		List<String[]> a1 = new ArrayList<String[]>();
	      a1.add(str);
	      a1.add(str1);
	      a1.add(str2);      
	      System.out.println(" ArrayList Elements:");
	      
	      
	      for (String[] str4:a1) 
	      {
	      System.out.println(Arrays.toString(str4));
	      }
	      
	      
	      //Nested Lists
	    
	      List<List<String>> l3 = new ArrayList<List<String>>();
	      
	      List <String> l1= new ArrayList<String>();
	      l1.add("Zara");
	      l1.add("Mahnaz");
	      l1.add("Ayan"); 
	      
	      List <String> l2= new ArrayList<String>();
	      l2.add("Zara1");
	      l2.add("Mahnaz1");
	      l2.add("Ayan1"); 
	      
	      
	      l3.add(l1);
	      l3.add(l2);
	      
	      
	     Iterator<List<String>> i1=l3.iterator();
	     
	     while(i1.hasNext()) {
	     
	      Iterator<String> i2=((List<String>) i1.next()).iterator();
	      
	      
	      while(i2.hasNext()) {
	    	  
	    	  System.out.println(i2.next());
	      }
	     }
	     
	     
	     
	     //Nested Maps
	     Map <Integer,Integer> m1 = new LinkedHashMap<Integer, Integer>();
	     Map < String,String> m2 = new LinkedHashMap<String, String>();
	     Map < Map<Integer,Integer>, Map<String,String>> m3 = new LinkedHashMap<Map<Integer, Integer>, Map<String, String>>();
	     
	     m1.put(10,20);
	     m1.put(30,40);
	     m1.put(50,60);
	     
	     m2.put("Akshay","Akshay1");
	     m2.put("Akash","Akash1");
	     m2. put("Rushi","Rushi1");
	     
	     
	     m3.put(m1,m2);
	     
	     
	     System.out.println(m3.keySet()+"\n"+m3.values());
	     
		
	}

}
