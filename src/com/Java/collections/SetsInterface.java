package com.Java.collections;
import java.util.*;



public class SetsInterface {

	public static void main(String[] args) {
		
		
			//*******************HashSet********************************//
		
		 	 int count[] = {34,22,10,60,30,22,};
		 	 Set<Integer> set = new HashSet<Integer>();
		 	 try {
	         
		 		 for(int i = 0; i < 5; i++) {
		 			 set.add(count[i]);
		 		 }
	         System.out.println("The Hast Set is:");
	         System.out.println(set);
	           
	         //can be used instead of iterator except to remove elements
	         System.out.println("\nUsing For Each Loop:");
	         for( Integer one:set) {
	        	System.out.print(+one+" ");
	         }
	         	         
	         System.out.println("\n\nUsing Iterator:");
	         Iterator<Integer> i=set.iterator();
	         
	         while (i.hasNext()) {
	         System.out.print(i.next() + " ");} 
	        	
	        
	        
	         //************************TreeSet**************************//
	         
	         TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
	         System.out.println("\n\nThe sorted set is:");
	         System.out.println(sortedSet);

	         System.out.println("\nThe First element of the set is: "+ (Integer)sortedSet.first());
	         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
		 	 }
		 	 catch(Exception e) {}
		 	 
		 	 
		 	//*********************************************************//
		 	 
		 	HashSet<String> Set2 = new HashSet<String>();
		 	Set2.add("Don");
		 	Set2.add("Jonas");
		 	Set2.add("Nick");
		 	Set2.add("King");
		 	Set2.add("Don");//Doesn't store duplicates
		 	Set2.add(null); //Doesn't allow more than one null values
		 	Set2.add(null);
		 	
		 	System.out.println("\n\nThe HashSet is:");
	        System.out.println(Set2);
	        
	        
	        //********************LinkedHashSet************************//
	        
	        //Remembers the insertion order
	    	LinkedHashSet<String> Set3 = new LinkedHashSet<String>();
		 	Set3.add("Don");
		 	Set3.add("Jonas");
		 	Set3.add("Nick");
		 	Set3.add("King");
		 	Set3.add("Don");//Doesn't store duplicates
		 	Set3.add(null); //Doesn't allow more than one null values
		 	Set3.add(null);
		 	
		 	System.out.println("\n\nThe HashSet is:");
	        System.out.println(Set3);
	        
	        
	        
	        
	        
	        
	}

}
